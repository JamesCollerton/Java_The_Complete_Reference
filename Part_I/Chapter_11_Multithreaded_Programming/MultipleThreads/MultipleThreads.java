public class MultipleThreads {

	public static void main(String[] args){

		try {
			ThreadClass threadClassA = new ThreadClass("A");	
			ThreadClass threadClassB = new ThreadClass("B");	
			ThreadClass threadClassC = new ThreadClass("C");	

			threadClassA.start();
			threadClassB.start();
			threadClassC.start();

			Thread.sleep(1500);
		
			System.out.println("Done main thread");
		} catch (Exception e){
			System.out.println("Caught exception in main");
		}

	}

} 
