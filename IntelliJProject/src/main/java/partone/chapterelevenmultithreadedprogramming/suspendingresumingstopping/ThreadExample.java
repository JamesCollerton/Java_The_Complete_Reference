package partone.chapterelevenmultithreadedprogramming.suspendingresumingstopping;

public class ThreadExample implements Runnable {

    private final Thread thread;
    private boolean suspended;

    ThreadExample() {
        thread = new Thread(this);
        suspended = false;
        thread.start();
    }

    public synchronized void run() {
        try {
            for (int i = 0; i < 15; i++) {
                if (suspended) {
                    System.out.println("Thread suspended.");
                    wait();
                }
                System.out.println("Thread now running again: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public synchronized void threadSuspend() {
        suspended = true;
    }

    public synchronized void threadResume() {
        notify();
        suspended = false;
    }

}
