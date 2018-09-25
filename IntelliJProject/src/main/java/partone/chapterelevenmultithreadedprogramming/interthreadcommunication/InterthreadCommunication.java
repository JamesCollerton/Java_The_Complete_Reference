package partone.chapterelevenmultithreadedprogramming.interthreadcommunication;

public class InterthreadCommunication {

    /*
    Challenge: Implement a producer and consumer queuing system which is thread
    safe.
     */
    public static void main(String[] args) {

        QueueThread queueThread = new QueueThread();
        ProducerThread producerThread = new ProducerThread(queueThread);
        ConsumerThread consumerThread = new ConsumerThread(queueThread);

    }

}
