public class WaitNotifyExample {

	public static void main(String[] args){

		QueueClass queueClass = new QueueClass();

		Producer producer = new Producer(queueClass);
		Consumer consumer = new Consumer(queueClass);

		try {
			producer.join();
			System.out.println("Producer joined");
			consumer.join();
			System.out.println("Consumer joined");
		} catch(Exception e) {
			System.out.println("In main exception");
		}

	}

}
