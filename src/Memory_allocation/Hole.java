
package Memory_allocation;


public class Hole {
    private int size;
    private int baseAddress;
   
    public Hole(){
        size=0;
        baseAddress=0;
    }
        public Hole(int asize,int  abaseAddress){
        size=asize;
        baseAddress=abaseAddress;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(int baseAddress) {
        this.baseAddress = baseAddress;
    }
    
    
}
