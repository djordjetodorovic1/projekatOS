import java.util.Comparator;
import java.util.PriorityQueue;

public class ProcessManager implements Scheduler {
    private PriorityQueue<Process> processes;

    ProcessManager() {
        this.processes = new PriorityQueue<>(Comparator.comparing(Process::getProcessBurstTime));
    }

    public synchronized void addProcess(Process p) {
        processes.offer(p);
        p.ready();
    }

    public synchronized boolean isEmpty() {
        return processes.isEmpty();
    }

    public synchronized void removeProcess(Process p) {
        processes.remove(p);
    }

    @Override
    public synchronized Process scheduleNextProcess() {
        return processes.poll();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Process p : processes)
            sb.append(p + "\n");
        return sb.toString();
    }
}