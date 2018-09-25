package partone.chapterelevenmultithreadedprogramming.isalivejoin;

public class IsAliveJoin {

    public static void main(String[] args) {

        ExampleThread exampleThread = new ExampleThread();
        Thread thread = exampleThread.getThread();

        if(thread.isAlive()) {
            System.out.println("Thread alive.");
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread.");
        }

        if(!thread.isAlive()) {
            System.out.println("Thread not alive.");
        }

        System.out.println("Exiting main thread.");

    }

}
