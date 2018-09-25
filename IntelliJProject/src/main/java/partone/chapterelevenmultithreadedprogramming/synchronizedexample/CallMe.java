package partone.chapterelevenmultithreadedprogramming.synchronizedexample;

public class CallMe {

    public synchronized void call(String message) {

//        synchronized (CallMe.class) {

            System.out.print("[");
            System.out.print(message);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted with message: " + message);
            }

            System.out.println("]");

//        }

    }

}
