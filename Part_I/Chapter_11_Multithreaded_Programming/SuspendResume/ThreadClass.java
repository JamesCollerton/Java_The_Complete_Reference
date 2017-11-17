public class ThreadClass implements Runnable {

	Thread thread;
	boolean isSuspended;

	ThreadClass(){
		thread = new Thread(this, "ThreadClass");
		thread.start();
	}	

	@Override
	public void run(){
		
		try {
			for(int i = 0; i < 100; i++){
				System.out.println("Number: " + i);
				Thread.sleep(100);
				synchronized(this){
					while(isSuspended){
						wait();
					}
				}
			}
		} catch(Exception e){
			System.out.println("In the thread exception" + e);
		}
	}

	public synchronized Thread getThread(){
		return thread;
	}

	public synchronized void suspend(){
		isSuspended = true;
	}

	public synchronized void resume(){
		isSuspended = false;
		notify();
	}

}
