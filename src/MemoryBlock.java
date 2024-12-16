public class MemoryBlock {
    private int memoryBlockAddress;
    private int memoryBlockSize;
    private boolean memoryBlockAllocated;

    public MemoryBlock(int memoryBlockAddress, int memoryBlockSize, boolean memoryBlockAllocated) {
        this.memoryBlockAddress = memoryBlockAddress;
        this.memoryBlockSize = memoryBlockSize;
        this.memoryBlockAllocated = memoryBlockAllocated;
    }

    public int getMemoryBlockAddress() {
        return memoryBlockAddress;
    }

    public void setMemoryBlockAddress(int memoryBlockAddress) {
        this.memoryBlockAddress = memoryBlockAddress;
    }

    public int getMemoryBlockSize() {
        return memoryBlockSize;
    }

    public void setMemoryBlockSize(int memoryBlockSize) {
        this.memoryBlockSize = memoryBlockSize;
    }

    public boolean isMemoryBlockAllocated() {
        return memoryBlockAllocated;
    }

    public void setMemoryBlockAllocated(boolean memoryBlockAllocated) {
        this.memoryBlockAllocated = memoryBlockAllocated;
    }

    @Override
    public String toString() {
        return "Adresa: " + memoryBlockAddress + " velicina: " + memoryBlockSize + " status: " + memoryBlockAllocated;
    }
}