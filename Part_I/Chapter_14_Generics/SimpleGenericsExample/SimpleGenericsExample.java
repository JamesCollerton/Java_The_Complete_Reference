public class SimpleGenericsExample {

	public static void main(String[] args){

		GenericClass<Integer> genericInteger = new GenericClass<Integer>(1);
		System.out.println("Integer: " + genericInteger.getObject());

		GenericClass<String> genericString = new GenericClass<String>("Some string");
		System.out.println("String " + genericString.getObject());

	}

}
