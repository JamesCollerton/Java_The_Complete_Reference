package parttwo.chaptertwentyeightconcurrencyutilities.semaphores;

import java.util.ArrayList;
import java.util.List;

public class QueueExample {

    private List<Integer> queueList = new ArrayList<>();

    public synchronized Integer get() {
        try {
            if (isEmpty()) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Queue example is interrupted");
        }
        Integer returnValue = queueList.get(0);
        queueList.remove(0);
        return returnValue;
    }

    public synchronized void put(Integer newValue) {
        queueList.add(newValue);
        notify();
    }

    public synchronized boolean isEmpty() {
        return queueList.isEmpty();
    }

}
