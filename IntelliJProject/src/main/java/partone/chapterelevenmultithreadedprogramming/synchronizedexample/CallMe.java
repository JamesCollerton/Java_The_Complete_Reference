package partone.chapterelevenmultithreadedprogramming.synchronizedexample;

public class CallMe {

    public void call(String message) {

        System.out.print("[");
        System.out.print(message);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted with message: " + message);
        }

        System.out.println("]");

    }

}
