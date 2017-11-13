public class ThreadExample {

	public static void main(String[] args){

		try {

			ThreadClass threadClass = new ThreadClass();

			threadClass.start();

			Thread.sleep(1500);

		} catch(Exception e){

			System.out.println("In main exception");

		}

		System.out.println("Done sleeping");
	
	}

}
