public class GenericConstructor {

	private interface GenericClassInterface<T> {
		GenericClass<T> construct(T value);
	}

	public static void main(String[] args) {

		GenericClassInterface<Integer> genClassIntFuncInt = GenericClass<Integer>::new;
		GenericClassInterface<String> genClassStringFuncInt = GenericClass<String>::new;
		
		GenericClass<String> genClassString = genClassStringFuncInt.construct("String");
		GenericClass<Integer> genClassInt = genClassIntFuncInt.construct(8); 

		System.out.println("Str val " + genClassString.getValue());
		System.out.println("Int val " + genClassInt.getValue());

	}

}
