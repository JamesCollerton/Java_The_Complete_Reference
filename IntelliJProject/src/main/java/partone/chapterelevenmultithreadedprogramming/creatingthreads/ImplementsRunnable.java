package partone.chapterelevenmultithreadedprogramming.creatingthreads;

public class ImplementsRunnable implements Runnable {

    /*
    Note, the thread ends when run finishes.
     */
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Implements runnable is running: " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted in extends thread.");
        }
    }

}
