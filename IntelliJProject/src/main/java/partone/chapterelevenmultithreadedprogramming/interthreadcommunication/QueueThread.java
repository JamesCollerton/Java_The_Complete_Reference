package partone.chapterelevenmultithreadedprogramming.interthreadcommunication;

public class QueueThread {

    private int currentValue;
    private boolean valueSet;

    public synchronized int get() {
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get interrupted.");
            }
        }
        valueSet = false;
        notify();
        return this.currentValue;
    }

    public synchronized void put(int newValue) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Put interrupted.");
            }
        }
        valueSet = true;
        notify();
        this.currentValue = newValue;
    }

}
