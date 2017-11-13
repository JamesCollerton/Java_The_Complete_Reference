public class RunnableExample {

	public static void main(String[] args){

		try{
			Thread thread = new Thread(new RunnableClass());
			thread.start();

			Thread.sleep(10000); 
		} catch(Exception e){
			System.out.println("Exception in main.");
		}

		System.out.println("Done");

	}

}
