public class ThreadClass extends Thread {

	private CallClass callClass;

	ThreadClass(CallClass callClass, String name){
		super(name);
		this.callClass = callClass;
	}

	@Override
	public void run(){
		callClass.call(getName());	
	}

}
