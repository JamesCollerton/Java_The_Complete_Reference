public class ExceptionExample extends Throwable {

	private int exceptionCode;

	ExceptionExample(int exceptionCode){
		this.exceptionCode = exceptionCode;
	}

	@Override
	public String toString(){
		return "Exception code: " + exceptionCode;
	}

}
