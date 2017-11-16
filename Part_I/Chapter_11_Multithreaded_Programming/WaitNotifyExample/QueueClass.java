public class QueueClass {

	private int n;
	private boolean valueExists = false;

	public synchronized void put(int n){
		
		// If something's on the queue leave it.
		while(valueExists){
			try {
				wait();
			} catch(Exception e){
				System.out.println("In exception for put.");
			}
		}

		this.n = n;
		System.out.println("Putting " + n);
		valueExists = true;
		notify();

	}

	public synchronized int get(){
		
		while(!valueExists){
			try{
				wait();
			} catch(Exception e){
				System.out.println("In exception for get.");
			}
		}

		valueExists = false;
		System.out.println("Getting " + n);
		notify();
		return n;

	}

}
