public class ExampleMain {

	public static void main(String[] args){

		GenericFunctionalInterface<String> sfi = s -> "String " + s;

		System.out.println(sfi.getValue("Some string"));

		GenericFunctionalInterface<Integer> ifi = i -> i * i;

		System.out.println(ifi.getValue(10) + "");

	}

}
