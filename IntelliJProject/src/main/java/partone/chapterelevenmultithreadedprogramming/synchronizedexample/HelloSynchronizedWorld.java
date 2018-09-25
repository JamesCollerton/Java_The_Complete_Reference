package partone.chapterelevenmultithreadedprogramming.synchronizedexample;

public class HelloSynchronizedWorld {

    /*
    Note: It's really important that these threads share the same object as the monitor
    is specific to the object. We can use a synchronized block to synchronize over all instances
    of a class, but if we synchronize the method it only works for the shared object.
     */
    public static void main(String[] args) {

        CallMe callMe = new CallMe();

        CallMeThread helloThread = new CallMeThread(callMe, "Hello");
        CallMeThread synchronizedThread = new CallMeThread(callMe, "Synchronized");
        CallMeThread worldThread = new CallMeThread(callMe, "World");

        try {
            helloThread.getThread().join();
            synchronizedThread.getThread().join();
            worldThread.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

    }

}
