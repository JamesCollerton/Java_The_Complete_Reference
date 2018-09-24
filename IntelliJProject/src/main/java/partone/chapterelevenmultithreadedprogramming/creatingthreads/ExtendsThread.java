package partone.chapterelevenmultithreadedprogramming.creatingthreads;

public class ExtendsThread extends Thread {

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Extends thread is running: " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted in extends thread.");
        }
    }

}
