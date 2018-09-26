package partone.chapterelevenmultithreadedprogramming.suspendingresumingstopping;

public class SuspendingResumingStopping {

    public static void main(String[] args) {

        ThreadExample threadExample = new ThreadExample();

        try {
            threadExample.threadSuspend();
            Thread.sleep(200);
            threadExample.threadResume();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }

    }

}
