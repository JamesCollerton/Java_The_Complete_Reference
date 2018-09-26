package parttwo.chaptertwentyeightconcurrencyutilities.semaphores;

import java.util.concurrent.Semaphore;

public class ConsumerExample implements Runnable {

    private final Semaphore    semaphore;
    private final QueueExample queueExample;
    private final Thread       thread;

    ConsumerExample(Semaphore semaphore, QueueExample queueExample) {
        this.semaphore = semaphore;
        this.queueExample = queueExample;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                semaphore.acquire();
                System.out.println("Consumer thread acquired permit.");

                Integer j = queueExample.get();
                System.out.println("Got the value from the queue: " + j);

                Thread.sleep(500);

                semaphore.release();
                System.out.println("Consumer thread released permit.");
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }

    }

}
