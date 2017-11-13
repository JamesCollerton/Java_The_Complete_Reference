public class ThreadClass extends Thread {

	ThreadClass(){
		System.out.println("This is the thread class");
	}

	@Override
	public void run(){

		try {
			for(int i = 0; i < 10; i++){
				System.out.println("In the thread now");
				Thread.sleep(100);
			}
		} catch(Exception e){
			System.out.println("In the catch of the thread class.");
		}

		System.out.println("Done thread class");

	}

}
