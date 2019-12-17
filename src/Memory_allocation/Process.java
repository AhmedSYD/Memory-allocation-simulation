
package Memory_allocation;


public class Process {
    private String name;
    private int size;
    private int baseAddress;
    private boolean isAllocated;
     
    public Process(){
        size=0;
        name="";
        baseAddress=0;
        isAllocated=false;
        
    }

    public Process(String name, int size, int baseAddress, boolean isAllocated) {
        this.name = name;
        this.size = size;
        this.baseAddress = baseAddress;
        this.isAllocated = isAllocated;
    }
        public Process(String name, int size) {
        this.name = name;
        this.size = size;
        baseAddress=0;
        isAllocated=false;
    }

    public boolean getIsAllocated() {
        return isAllocated;
    }

    public void setIsAllocated(boolean isAllocated) {
        this.isAllocated = isAllocated;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
