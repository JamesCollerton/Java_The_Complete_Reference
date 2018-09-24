public class GenericClass<T> {

	private T value;

	GenericClass(T value) {
		this.value = value;
	}

	public T getValue(){
		return value;
	}

}
