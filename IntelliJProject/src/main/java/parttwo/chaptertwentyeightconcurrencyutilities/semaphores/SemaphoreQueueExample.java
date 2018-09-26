package parttwo.chaptertwentyeightconcurrencyutilities.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreQueueExample {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);
        QueueExample queueExample = new QueueExample();

        ProducerExample producerExample = new ProducerExample(semaphore, queueExample);
        ConsumerExample consumerExample = new ConsumerExample(semaphore, queueExample);

    }

}
