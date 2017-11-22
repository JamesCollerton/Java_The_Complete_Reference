public class MyClass {

	private int value;

	MyClass(){
		ThreadA threadA = new ThreadA("ThreadA", this);
		ThreadB threadB = new ThreadB("ThreadB", this);
	}

	public int getValue(){
		return value;
	}

	public void setValue(int value){
		this.value = value;
	}

}
