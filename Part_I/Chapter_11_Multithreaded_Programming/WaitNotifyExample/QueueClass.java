public class QueueClass {

	private int n;
	private boolean valueExists = false;

	public synchronized void put(int n){
		
		// If something's on the queue leave it.
		while(valueExists){
			wait();
		}

		this.n = n;
		valueExists = true;
		notify();

	}

	public synchronized int get(){
		
		while(!valueExists){
			wait();
		}

		valueExists = false;
		notify();
		return n;

	}

}
