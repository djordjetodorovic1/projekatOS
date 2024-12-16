public class Kernel {
    private CPU cpu = new CPU();
    private ProcessManager processManager = new ProcessManager();
    private MemoryManager memoryManager = new MemoryManager();
    private HDDManager hddManager = new HDDManager();
    private FileSystemManager fileSystemManager = new FileSystemManager();

    Kernel() {
    }

    public void start() {
        Process p1 = new Process(5.5, "Code1");
        Process p2 = new Process(4.5, "Code2");
        processManager.addProcess(p1);
        processManager.addProcess(p2);
        while (!processManager.isEmpty()) {
            Process nextProcess = processManager.scheduleNextProcess();
            if (nextProcess != null) {
                System.out.println(nextProcess);
                //cpu.run(nextProcess);
            }
        }
    }
}