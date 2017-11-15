public class ThreadClass extends Thread {

	ThreadClass(int priority){
		setPriority(priority);
	}

	@Override
	public void run(){

		try {

			for(int i=0; i < 10; i++){
				System.out.println("In thread " + getPriority());
			}
		
		} catch(Exception e){

			System.out.println("In exception from thread.");

		}
	}

}
