public class ThreadClass extends Thread {

	ThreadClass(String name){
		super(name);
	}

	@Override
	public void run(){

		try {

			for(int i = 0; i < 10; i++){
				System.out.println(getName() + i);
				Thread.sleep(100);
			}

		} catch(Exception e){
			System.out.println("Caught exception in thread");
		}
	}

}
