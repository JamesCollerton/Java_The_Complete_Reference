package partone.chapterelevenmultithreadedprogramming.interthreadcommunication;

public class ConsumerThread implements Runnable {

    private final Thread thread;
    private final QueueThread queueThread;

    ConsumerThread(QueueThread queueThread) {
        this.thread = new Thread(this);
        this.queueThread = queueThread;
        thread.start();
    }

    public void run() {
        while(true) {
            int i = queueThread.get();
            System.out.println("Consumer thread retrieved value: " + i);
        }
    }

}
