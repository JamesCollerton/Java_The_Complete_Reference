public class MainExample {

	public static void main(String[] args){

		exampleFunction(s -> "String " + s, "Some String");
		exampleFunction(i -> i * i, 10);

	}

	private static <T> void exampleFunction(FunctionalInterface<T> functionalInterface, T obj){
		System.out.println(functionalInterface.execute(obj));
	}

}
