public class Consumer extends Thread {

	private QueueClass  queueClass;

	Consumer(QueueClass queueClass){
		this.queueClass = queueClass;
		this.run();
	}

	@Override
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println("Getting: " + queueClass.get());
		}
	}

}
