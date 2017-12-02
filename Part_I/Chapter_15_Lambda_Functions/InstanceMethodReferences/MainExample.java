import java.util.function.*;

public class MainExample {

	@FunctionalInterface
	private interface InstanceMethodInterface<O, T> {
		public Boolean execute(O obj, T[] arr);
	}

	private static <T> void checkIsIn(Function<T[], Boolean> function, T[] objArr){
		if(function.apply(objArr).booleanValue()){
			System.out.println("In the array");
		} else {
			System.out.println("Not in the array");
		}
	}

	private static <O, T> void checkIsIn(InstanceMethodInterface<O, T> function, T[] objArr, O object){
		if(function.execute(object, objArr).booleanValue()){
			System.out.println("In the array");
		} else {
			System.out.println("Not in the array");
		}
	}

	public static void main(String[] args){

		Integer[] intArr = new Integer[]{0, 1, 2, 3};

		// Instance reference
		ClassExample<Integer> classExampleOne = new ClassExample<Integer>(2);
		Function<Integer[], Boolean> functionOne = classExampleOne::isIn;
		checkIsIn(functionOne, intArr);	

		// General reference used on instance
		ClassExample<Integer> classExampleTwo = new ClassExample<Integer>(5);
//		Function<Integer[], Boolean> functionTwo = ClassExample::isIn;
		checkIsIn(ClassExample::isIn, intArr, classExampleTwo);

	}

}
