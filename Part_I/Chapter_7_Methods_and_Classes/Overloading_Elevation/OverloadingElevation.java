public class OverloadingElevation {

	public static void main(String[] args){

		int a = 10;

		testFunction(a);	
	
	}	

	private static void testFunction(double num){

		System.out.println("Number is " + num);

	}

}
