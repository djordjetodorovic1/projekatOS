public class CPU extends Thread{
    private Register IP;
    private Register SP;
    private Register R1;
    private Register R2;
    private boolean busy;
    private int clockCycle;

    CPU(){
        Register IP = new Register("IP", "00", "00");
    }

    @Override
    public void run() {
        //
    }
}