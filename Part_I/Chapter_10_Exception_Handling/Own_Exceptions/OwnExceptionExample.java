public class OwnExceptionExample {

	public static void main(String[] args){

		try {
			throw new ExceptionExample(0);
		} catch(ExceptionExample e){
			System.out.println(e);
		}

	}

}
