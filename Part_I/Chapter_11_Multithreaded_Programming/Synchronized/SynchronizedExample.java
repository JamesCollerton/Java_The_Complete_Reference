public class SynchronizedExample {

	public static void main(String[] args){

		try {
			CallClass callClass = new CallClass();

			ThreadClass threadA = new ThreadClass(callClass, "Class A");
			ThreadClass threadB = new ThreadClass(callClass, "Class B");
			ThreadClass threadC = new ThreadClass(callClass, "Class C");

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
