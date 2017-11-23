public class GenericClass<T> {

	T object;

	GenericClass(T object){
		this.object = object;
	}

	public T getObject(){
		return object;
	}

}
