package parttwo.chaptertwentyeightconcurrencyutilities;

import java.util.concurrent.Semaphore;

public class ProducerExample implements Runnable {

    private final Semaphore semaphore;
    private final QueueExample queueExample;
    private final Thread thread;

    ProducerExample(Semaphore semaphore, QueueExample queueExample) {
        this.semaphore = semaphore;
        this.queueExample = queueExample;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try {
            for(int i = 0; i < 5; i++) {
                semaphore.acquire();
                System.out.println("Producer thread acquired permit.");

                queueExample.put(i);
                System.out.println("Put the value on the queue: " + i);
                Thread.sleep(500);

                semaphore.release();
                System.out.println("Producer thread released permit.");
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }

    }
}
