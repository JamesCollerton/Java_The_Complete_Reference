public class ThreadB implements Runnable {

	private Thread thread;
	private MyClass myClass;

	ThreadB(String name, MyClass myClass){
		thread = new Thread(this, name);
		thread.start();
		this.myClass = myClass;
	}

	@Override
	public void run(){
		
		int i = 0;

		try {
			while(myClass.getValue() < 5){
				System.out.println("Setting value " + i);
				myClass.setValue(i++);
				Thread.sleep(500);
			}
		} catch(InterruptedException e){
			System.out.println("ThreadA interrupted" + e);
		}
		
	}

}
