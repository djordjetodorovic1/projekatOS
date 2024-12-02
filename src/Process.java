public class Process {
    private static volatile int counter = 0;
    private int id;
    private ProcessState state;
    private String code;
    private double burstTime;

    Process(double burstTime) {
        this.id = counter++;
        this.state = ProcessState.NEW;
        this.burstTime = burstTime;
    }

    Process(double burstTime, String code) {
        this(burstTime);
        this.code = code;
    }

    public void start() {
        this.state = ProcessState.RUNNING;
    }

    public void terminate() {
        this.state = ProcessState.TERMINATED;
    }

    public void block() {
        this.state = ProcessState.BLOCKED;
    }

    public void unblock() {
        this.state = ProcessState.READY;
    }

    public ProcessState getState() {
        return this.state;
    }

    public String getCode() {
        return this.code;
    }

    public double getBurstTime() {
        return this.burstTime;
    }

    @Override
    public String toString() {
        return "Process:" + "id=" + this.id + ", state=" + this.state + ", code='" + this.code + '\'' + ", burstTime=" + this.burstTime;
    }
}