public class ChainedExceptionsExample {

	public static void main(String[] args){

		exampleMethod();

	}

	public static void exampleMethod(){

		NullPointerException npe = new NullPointerException("NPE Message");
		ArithmeticException ae = new ArithmeticException("AE Message");

		npe.initCause(ae);

	}		

}
