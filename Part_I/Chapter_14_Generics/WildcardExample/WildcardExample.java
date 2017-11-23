public class WildcardExample {

	public static void main(String[] args){

		GenericClass<Double> doubleGeneric = new GenericClass<Double>(new Double[]{1.0, 2.0, 3.0});
		GenericClass<Integer> integerGeneric = new GenericClass<Integer>(new Integer[]{1, 2, 3});

		System.out.println("Double compare: " + doubleGeneric.compareAverage(integerGeneric));
		System.out.println("Integer compare: " + integerGeneric.compareAverage(doubleGeneric));
		
	}

}
