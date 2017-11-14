public class JoinExample {

	public static void main(String[] args){

		ThreadClass threadA = new ThreadClass("A");
		ThreadClass threadB = new ThreadClass("B");
		ThreadClass threadC = new ThreadClass("C");

		threadA.start();
		threadB.start();
		threadC.start();

		try {
			threadA.join();
			System.out.println("Thread A finished");
			threadB.join();
			System.out.println("Thread B finished");
			threadC.join();
			System.out.println("Thread C finished");
		} catch(Exception e){
			System.out.println("Exception in main");
		}

	}

} 
