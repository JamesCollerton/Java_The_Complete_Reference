public class FunctionalInterfaces {

	public static void main(String[] args){

		MyNumber myNumber = () -> 123.45;

		System.out.println("Functional interface example " + myNumber.getValue());	

		MyNumberMultipleParameters myNumTwoParams = (a, b) -> a + b;

		System.out.println("Functional interface example " + myNumTwoParams.getValue(1, 2));	

	}

}
