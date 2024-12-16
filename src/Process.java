public class Process {
    private static volatile int counterID = 0;
    private final int processID;
    private ProcessState processState;
    private String processCode;
    private double processBurstTime;

    Process(double burstTime) {
        this.processID = counterID++;
        this.processState = ProcessState.NEW;
        this.processBurstTime = burstTime;
    }

    Process(double processBurstTime, String processCode) {
        this(processBurstTime);
        this.processCode = processCode;
    }

    public void start() {
        this.processState = ProcessState.RUNNING;
    }

    public void terminate() {
        this.processState = ProcessState.TERMINATED;
    }

    public void block() {
        this.processState = ProcessState.BLOCKED;
    }

    public void ready() {
        this.processState = ProcessState.READY;
    }

    public ProcessState getProcessState() {
        return this.processState;
    }

    public String getProcessCode() {
        return this.processCode;
    }

    public double getProcessBurstTime() {
        return this.processBurstTime;
    }

    @Override
    public String toString() {
        return "Process: id=" + this.processID + ", state=" + this.processState + ", code='" + this.processCode + "', burstTime=" + this.processBurstTime;
    }
}