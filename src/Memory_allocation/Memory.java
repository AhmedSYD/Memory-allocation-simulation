
package Memory_allocation;

import java.util.*;
public class Memory {
    private int size;
    private int noProcess;
    private int allocationMethod; 
    private Vector<Process> arrProcess=new Vector<>(100,2);
    private Vector<Hole> arrHoles=new Vector<>(100,2);
     private Vector<Hole> sortedHoles=new Vector<>(100,2);
      private Vector<Hole> wcsortedHoles=new Vector<>(100,2);
      private int compactionFlag;//if compactionFlag=0 mean deallocate without compaction and if equa 1 deallocate with compaction
    public Memory(){
        size=0;
        noProcess=0;
        allocationMethod = 0;
        compactionFlag=0;
    }

    public int getCompactionFlag() {
        return compactionFlag;
    }

    public void setCompactionFlag(int compactionFlag) {
        this.compactionFlag = compactionFlag;
    }
    
    public int getNoProcess() {
        return noProcess;
    }

    public void setNoProcess(int noProcess) {
        this.noProcess = noProcess;

    }

    public Vector<Process> getArrProcess() {
        return arrProcess;
    }

    public Vector<Hole> getArrHoles() {
        return arrHoles;
    }
      public Vector<Hole> getSortedBaseHoles() {
          Vector<Hole> temp=new Vector<>(100,2);
        temp=sortHoleBaseAddress(arrHoles);

        return temp;
    }
    public Vector<Process> getSortedBaseProcess() {
        Vector<Process> temp=new Vector<>(100,2);
       temp=sortProcessBaseAddress(arrProcess);

         return temp;
    }

    public int getAllocationMethod() {
        return allocationMethod;
    }
        public void setAllocationMethod(int type) {
         allocationMethod=type;

    }
  
    
    
    public void AllocateHoles(Hole h){
       arrHoles.addElement(h);

    }
      public void AllocateProcess(Process p){
       arrProcess.addElement(p); 

    }
    public void allocationMemory(){
    if(allocationMethod == 0)//best fit
    {
        sortedHoles = sortHole(arrHoles);
        arrHoles = sortedHoles;
        fitAlgorithm(sortedHoles);
    }
    else if(allocationMethod== 1) //first fit
    {
        fitAlgorithm(arrHoles);
    
    }
    else if(allocationMethod== 2) //worst fit
    {
        wcsortedHoles = sortHolebig(arrHoles);
        arrHoles = wcsortedHoles;
        fitAlgorithm(wcsortedHoles);
    
    }
    
    } 
    
    public void deAllocationMemory(Process p){
        
       Hole temp=new Hole(p.getSize(),p.getBaseAddress());
       arrHoles.addElement(temp);
       p.setSize(0);
       for(int i=0;i<noProcess;i++){
           if(arrProcess.get(i).getSize()==0){
              arrProcess.remove(i);
              break;
       }
     }
       if(compactionFlag == 1){
           cmapct();
       }
   
       noProcess--;
       if(allocationMethod == 0){//best fit 
          sortedHoles = sortHoleBaseAddress(sortedHoles);
        for(int i=0;i<sortedHoles.size()-1;i++){
            //check for consecutvie holes 
            if((sortedHoles.get(i).getBaseAddress() + sortedHoles.get(i).getSize()) == sortedHoles.get(i+1).getBaseAddress() ){
                sortedHoles.get(i).setSize(sortedHoles.get(i).getSize() + sortedHoles.get(i+1).getSize());//enlarge the first hole 
                sortedHoles.remove(i+1);//remove the second hole
                i--;
            }
        }
        arrHoles = sortedHoles;
       }
       else if(allocationMethod == 1){//first fit
           arrHoles = sortHoleBaseAddress(arrHoles);
           for(int i=0;i<arrHoles.size()-1;i++){
            //check for consecutvie holes 
            if((arrHoles.get(i).getBaseAddress() + arrHoles.get(i).getSize()) == arrHoles.get(i+1).getBaseAddress() ){
                arrHoles.get(i).setSize(arrHoles.get(i).getSize() + arrHoles.get(i+1).getSize());//enlarge the first hole 
                arrHoles.remove(i+1);//remove the second hole
                i--;
            }
        }
       }
       else if(allocationMethod == 2){
                    wcsortedHoles = sortHoleBaseAddress(wcsortedHoles);
           for(int i=0;i<wcsortedHoles.size()-1;i++){
            //check for consecutvie holes 
            if((wcsortedHoles.get(i).getBaseAddress() + wcsortedHoles.get(i).getSize()) == wcsortedHoles.get(i+1).getBaseAddress() ){
                wcsortedHoles.get(i).setSize(wcsortedHoles.get(i).getSize() + wcsortedHoles.get(i+1).getSize());//enlarge the first hole 
                wcsortedHoles.remove(i+1);//remove the second hole
                i--;
            }
        }
           arrHoles = wcsortedHoles;
       }

       allocationMemory();
    }
    public void cmapct(){
       arrHoles =sortHoleInvertedBaseAddress(arrHoles);
           for(int i=0;i<arrProcess.size();i++){
               for(int j=0; j<arrHoles.size(); j++){
                   if(arrProcess.get(i).getBaseAddress() == (arrHoles.get(j).getBaseAddress()+arrHoles.get(j).getSize())){
                       //shift process to upper if this condition verified
                       arrProcess.get(i).setBaseAddress(arrHoles.get(j).getBaseAddress());
                       arrHoles.get(j).setBaseAddress(arrProcess.get(i).getBaseAddress()+arrProcess.get(i).getSize());
                   }
               }
           }
     }   
    public Vector<Hole> sortHole(Vector<Hole> arrHoles){// sort as size from small to big
                
         boolean flag = true;
          Hole temp; 
          while(flag)
          {
              flag = false;
              for(int i=0;  i<arrHoles.size()-1;  i++)
              {
                  if(arrHoles.get(i).getSize()>arrHoles.get(i+1).getSize())
                  {
                      temp=arrHoles.get(i);
                      arrHoles.set(i,arrHoles.get(i+1));
                      arrHoles.set(i+1,temp);
                      flag = true;
                  }
              }
                  
              
          }
          return arrHoles;
    }
    public Vector<Hole> sortHolebig(Vector<Hole> arrHoles){// sort as size from big to small
                
         boolean flag = true;
          Hole temp; 
          while(flag)
          {
              flag = false;
              for(int i=0;  i<arrHoles.size()-1;  i++)
              {
                  if(arrHoles.get(i).getSize()<arrHoles.get(i+1).getSize())
                  {
                      temp=arrHoles.get(i);
                      arrHoles.set(i,arrHoles.get(i+1));
                      arrHoles.set(i+1,temp);
                      flag = true;
                  }
              }
                  
              
          }
          return arrHoles;
    }
    
public Vector<Hole> sortHoleBaseAddress(Vector<Hole> arrHoles){// sort holes as base address 
                
         boolean flag = true;
          Hole temp; 
          while(flag)
          {
              flag = false;
              for(int i=0;  i<arrHoles.size()-1;  i++)
              {
                  if(arrHoles.get(i).getBaseAddress()>arrHoles.get(i+1).getBaseAddress())
                  {
                      temp=arrHoles.get(i);
                      arrHoles.set(i,arrHoles.get(i+1));
                      arrHoles.set(i+1,temp);
                      flag = true;
                  }
              }
                  
              
          }
          return arrHoles;
    }
public Vector<Hole> sortHoleInvertedBaseAddress(Vector<Hole> arrHoles){// sort holes as base address from big to small
                
         boolean flag = true;
          Hole temp; 
          while(flag)
          {
              flag = false;
              for(int i=0;  i<arrHoles.size()-1;  i++)
              {
                  if(arrHoles.get(i).getBaseAddress()<arrHoles.get(i+1).getBaseAddress())
                  {
                      temp=arrHoles.get(i);
                      arrHoles.set(i,arrHoles.get(i+1));
                      arrHoles.set(i+1,temp);
                      flag = true;
                  }
              }
                  
              
          }
          return arrHoles;
    }
public Vector<Process> sortProcessBaseAddress(Vector<Process> arrProcess){// sort process as base address 
                
         boolean flag = true;
          Process temp; 
          while(flag)
          {
              flag = false;
              for(int i=0;  i<arrProcess.size()-1;  i++)
              {
                  if(arrProcess.get(i).getBaseAddress()>arrProcess.get(i+1).getBaseAddress())
                  {
                      temp=arrProcess.get(i);
                      arrProcess.set(i,arrProcess.get(i+1));
                      arrProcess.set(i+1,temp);
                      flag = true;
                  }
              }
                  
              
          }
          return arrProcess;
    }
        public void fitAlgorithm(Vector<Hole> arrH){//its function allocate process into hole
       for(int i=0;i<arrProcess.size();i++)
       {

           if(! (arrProcess.get(i).getIsAllocated()))
           {
             for(int j=0;j<arrH.size();j++){
                if(arrProcess.get(i).getSize()<=arrH.get(j).getSize()){
                  arrProcess.get(i).setIsAllocated(true);
                  arrProcess.get(i).setBaseAddress(arrH.get(j).getBaseAddress());
                  arrH.get(j).setSize(arrH.get(j).getSize() - arrProcess.get(i).getSize());
                  arrH.get(j).setBaseAddress(arrH.get(j).getBaseAddress() + arrProcess.get(i).getSize());
                  break;
             }
           }
        }
       }
       
       
    }
     
    public void print(){
        System.out.println("this is process:");
        for(int i=0;i<noProcess;i++){
            if(arrProcess.get(i).getIsAllocated()){
            System.out.println(arrProcess.get(i).getBaseAddress());
            System.out.println(arrProcess.get(i).getName());
            System.out.println(arrProcess.get(i).getSize()+arrProcess.get(i).getBaseAddress());
            }
        }
        System.out.println("-----------------");
        System.out.println("this is hole:");
         for(int i=0;i<arrHoles.size();i++){
            System.out.println(arrHoles.get(i).getBaseAddress());
            System.out.println(arrHoles.get(i).getSize());
            System.out.println("--");
        }
    }
    
} 
