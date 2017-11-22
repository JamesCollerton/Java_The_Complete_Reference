public class ThreadA implements Runnable {

	private Thread thread;
	private MyClass myClass;

	ThreadA(String name, MyClass myClass){
		thread = new Thread(this, name);
		thread.start();
		this.myClass = myClass;
	}

	@Override
	public void run(){

		try {
			while(myClass.getValue() < 5){
				System.out.println("Getting value " + myClass.getValue());
				Thread.sleep(500);
			}
		} catch(InterruptedException e){
			System.out.println("ThreadA interrupted" + e);
		}
	
	}

}
