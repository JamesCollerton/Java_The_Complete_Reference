public class ComparableClass implements Comparable<ComparableClass> {

	private int value;

	ComparableClass(int value) {
		this.value = value;
	}

	public int compareTo(ComparableClass comparableClass){
		return Integer.compare(this.value, comparableClass.getValue());
	}

	public int getValue(){
		return value;
	}

}
