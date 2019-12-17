
package Memory_allocation;


public class MemoryAllocation {


    public static void main(String[] args) {
        Hole h1=new Hole(75,5);//(size,address)
        Hole h2=new Hole(10,90);
        //Hole h3=new Hole(80,210);
        Process p0=new Process("p0",10);
        Process p1=new Process("p1",10);//(name,size)
        Process p2=new Process("p2",20);
        Process p3=new Process("p3",15);
        Memory mem=new Memory();
        mem.AllocateHoles(h1);   mem.AllocateHoles(h2);
      mem.setNoProcess(4);  mem.AllocateProcess(p0); mem.AllocateProcess(p1);    mem.AllocateProcess(p2);   mem.AllocateProcess(p3);
      //0-->is best fit and 1-->first fit
      mem.setAllocationMethod(1);
       mem.allocationMemory();
       mem.print();
       System.out.println("----------");
       System.out.println("After deallocation:");
       mem.setCompactionFlag(0);
       mem.deAllocationMemory(p1);
       mem.print();
       System.out.println("----------");
       System.out.println("After deallocation:");
       mem.setCompactionFlag(1);
       mem.deAllocationMemory(p0);
       mem.print();
       
    }   
}
