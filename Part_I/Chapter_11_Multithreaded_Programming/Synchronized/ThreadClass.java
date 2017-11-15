public class ThreadClass extends Thread {

	ThreadClass(String name){
		super(name);
	}

	@Override
	public void run(){
		new CallClass().call(getName());	
	}

}
