package partone.chapterelevenmultithreadedprogramming.isalivejoin;

public class ExampleThread implements Runnable {

    private Thread thread;

    ExampleThread() {
        thread = new Thread(this, "Example Thread");
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In example thread: " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted example thread");
        }
    }

    public Thread getThread() {
        return thread;
    }

}
