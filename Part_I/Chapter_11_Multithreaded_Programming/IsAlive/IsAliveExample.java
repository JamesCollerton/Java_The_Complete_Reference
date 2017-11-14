public class IsAliveExample {

	public static void main(String[] args){

		try {

			ThreadClass thread = new ThreadClass("Thread");

			thread.start();

			while(thread.isAlive()){
				Thread.sleep(100);
			}

		System.out.println("Done");

		} catch(Exception e){

			System.out.println("In main exception");

		}

	}

}
