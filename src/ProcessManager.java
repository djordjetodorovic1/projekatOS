import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessManager implements Scheduler {
    private Queue<Process> pm;

    ProcessManager() {
        this.pm = new PriorityQueue<>(Comparator.comparingDouble(p->p.getBurstTime()));
    }

    public synchronized void add(Process p) {
        pm.offer(p);
    }

    public synchronized boolean isEmpty() {
        return pm.isEmpty();
    }

    @Override
    public synchronized Process scheduleNextProcess() {
        return pm.poll();
    }

    @Override
    public String toString() {
        String result = "";
        for (Process p : pm) {
            result += p + "\n";
        }
        return result;
    }
}