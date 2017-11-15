public class SynchronizedExample {

	public static void main(String[] args){

		try {
			ThreadClass threadA = new ThreadClass("Class A");
			ThreadClass threadB = new ThreadClass("Class B");
			ThreadClass threadC = new ThreadClass("Class C");

			threadA.start();
			threadB.start();
			threadC.start();
			
			threadA.join();
			System.out.println("Thread A done");
			threadB.join();
			System.out.println("Thread B done");
			threadC.join();
			System.out.println("Thread C done");

		} catch(Exception e){
			System.out.println("In main exception");
		}

	}

} 
