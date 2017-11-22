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

		int i = -1;

		while(myClass.getValue() < 5){
			if(myClass.getValue() != i) {
				System.out.println("Getting value " + myClass.getValue());
				i = myClass.getValue();
			}
		}
	}

}
