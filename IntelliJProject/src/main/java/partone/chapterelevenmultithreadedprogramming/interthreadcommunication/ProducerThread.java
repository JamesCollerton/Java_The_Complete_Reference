package partone.chapterelevenmultithreadedprogramming.interthreadcommunication;

public class ProducerThread implements Runnable {

    private final Thread thread;
    private final QueueThread queueThread;

    ProducerThread(QueueThread queueThread) {
        this.queueThread = queueThread;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        int i = 0;
        while(true) {
            queueThread.put(i);
            System.out.println("Producer thread produced value: " + i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Producer thread interrupted.");
            }
        }
    }

}
