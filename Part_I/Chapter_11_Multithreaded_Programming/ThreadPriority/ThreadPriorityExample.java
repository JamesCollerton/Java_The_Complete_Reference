public class ThreadPriorityExample {

	public static void main(String[] args){

		ThreadClass threadA = new ThreadClass(1);
		ThreadClass threadB = new ThreadClass(2);

		try {

			threadA.start();
			System.out.println("Thread A started");
			threadB.start();
			System.out.println("Thread B started");

			threadA.join();
			System.out.println("Thread A joined");
			threadB.join();
			System.out.println("Thread B joined");

		} catch(Exception e){
			
			System.out.println("In exception in main");

		}

		System.out.println("Finished main thread");

	}

}
