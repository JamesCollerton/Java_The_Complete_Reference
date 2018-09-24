package partone.chapterelevenmultithreadedprogramming.isalivejoin;

public class IsAliveJoin {

    public static void main(String[] args) {

        ExampleThread exampleThread = new ExampleThread();
        Thread thread = exampleThread.getThread();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread.");
        }

        System.out.println("Exiting main thread.");

    }

}
