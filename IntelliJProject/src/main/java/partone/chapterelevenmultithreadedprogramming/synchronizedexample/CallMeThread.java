package partone.chapterelevenmultithreadedprogramming.synchronizedexample;

public class CallMeThread implements Runnable {

    private final Thread thread;
    private final String message;
    private final CallMe callMe;

    CallMeThread(CallMe callMe, String message) {
        this.message = message;
        this.callMe = callMe;
        this.thread = new Thread(this);
        thread.start();
    }

    public void run() {
        callMe.call(message);
    }

}
