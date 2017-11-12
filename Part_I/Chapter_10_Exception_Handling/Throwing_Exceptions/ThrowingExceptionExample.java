public class ThrowingExceptionExample {

	public static void main(String[] args){
		
		exampleMethod();

	}

	private static void exampleMethod(){

		try {
			throw new NullPointerException("Here's an exception");
		} catch(NullPointerException e){
			System.out.println("Caught exception");
		}

	}

}
