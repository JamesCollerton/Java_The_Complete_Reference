package partone.chapterelevenmultithreadedprogramming.mainthread;

public class MainThread {

    /*
        Note, Thread.sleep() is used to pause the current thread. As we are on the main thread this pauses the main
        thread.
     */
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        thread.setName("Main Thread");

        System.out.println("Current thread name: " + thread.getName());

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                System.out.println("Value: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }

    }

}
