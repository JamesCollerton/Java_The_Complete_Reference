public class MainThreadExample {

	public static void main(String[] args){
		exampleMethod();
	}

	public static void exampleMethod(){
		
		Thread thread = Thread.currentThread();

		System.out.println("Current thread: " + thread);

		thread.setName("New thread name");

		System.out.println("Current thread: " + thread);

		try {
			for(int i = 0; i < 5; i ++){
				System.out.println("Sleeping thread");
				thread.sleep(100);
			}
		} catch(Exception e){
			System.out.println("Something went wrong!");
		}

	}

}
