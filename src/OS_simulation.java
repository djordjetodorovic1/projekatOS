public class OS_simulation {
    public static void main(String[] args) {
        Process p = new Process(7.4);
        Process p1 = new Process(3.2);
        Process p2 = new Process(5.5);
        Process p3 = new Process(1.2);
        Process p4 = new Process(0.2);
        ProcessManager pm = new ProcessManager();
        pm.add(p);
        pm.add(p1);
        pm.add(p2);
        pm.add(p3);
        System.out.println(pm);
        System.out.println(pm.scheduleNextProcess());
        System.out.println(pm.scheduleNextProcess());
        pm.add(p4);
        System.out.println(pm.scheduleNextProcess());
        System.out.println(pm.scheduleNextProcess());
        System.out.println(pm.scheduleNextProcess());
    }
}