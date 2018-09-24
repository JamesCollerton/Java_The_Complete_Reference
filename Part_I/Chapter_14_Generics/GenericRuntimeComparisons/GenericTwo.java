public class GenericTwo<T> extends GenericOne<T> {

	private T objTwo;

	GenericTwo(T objOne, T objTwo){
		super(objOne);
		this.objTwo = objTwo;
	}

	public T getObjTwo(){
		return objTwo;
	}

}
