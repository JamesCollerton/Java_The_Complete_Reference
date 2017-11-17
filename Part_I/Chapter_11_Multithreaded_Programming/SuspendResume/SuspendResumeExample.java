public class SuspendResumeExample {

	public static void main(String[] args){

		ThreadClass threadClass = new ThreadClass();

		try{
			threadClass.suspend();
			Thread.sleep(500);
			threadClass.resume();
			Thread.sleep(500);

			threadClass.getThread().join();
		} catch(Exception e){
			System.out.println("In main exception" + e);
		}

	}

}
