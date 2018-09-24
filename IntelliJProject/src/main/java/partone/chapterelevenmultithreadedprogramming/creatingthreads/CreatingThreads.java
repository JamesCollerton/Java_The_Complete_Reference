package partone.chapterelevenmultithreadedprogramming.creatingthreads;

public class CreatingThreads {

    public static void main(String[] args) {

        Thread implementsRunnable = new Thread(new ImplementsRunnable());
        Thread extendsThread = new ExtendsThread();

        implementsRunnable.start();
        extendsThread.start();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread running:" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

    }

}
