public class Producer extends Thread {

	private QueueClass queueClass;

	Producer(QueueClass queueClass){
		this.queueClass = queueClass;
		this.start();
	}

	@Override
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println("Putting " + i);
			queueClass.put(i);	
		}
	}

}
