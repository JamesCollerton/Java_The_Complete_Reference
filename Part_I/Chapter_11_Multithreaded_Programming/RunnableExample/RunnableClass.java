public class RunnableClass implements Runnable {

	@Override
	public void run(){

		try {
			for(int i = 0; i < 10; i++){
				System.out.println("Hello, world");
				Thread.sleep(500);
			}
		} catch(Exception e){
			System.out.println("Exception in runnable class.");
		}

	}

}
