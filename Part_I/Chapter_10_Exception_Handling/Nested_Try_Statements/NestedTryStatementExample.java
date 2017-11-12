public class NestedTryStatementExample {

	public static void main(String[] args){

		exampleMethod();

	}

	public static void exampleMethod(){

		int[] arr = {0, 1, 2};

		try {

			try {
				int a = arr[4];		 	
			} catch(ArithmeticException e){
				System.out.println("Caught arithmetic exception");
			} 

		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught array index out of bounds");
		}

	}

}
