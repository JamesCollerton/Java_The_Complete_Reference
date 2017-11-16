public class QueueClass {

	private int n;

	public synchronized void put(int n){
		this.n = n;
	}

	public synchronized int get(){
		return n;
	}

}
