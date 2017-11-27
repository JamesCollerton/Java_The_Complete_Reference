public class FunctionalInterfaces {

	public static void main(String[] args){

		MyNumber myNumber = () -> 123.45;

		System.out.println("Functional interface example " + myNumber.getValue());	

	}

}
