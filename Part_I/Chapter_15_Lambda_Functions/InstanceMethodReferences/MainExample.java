import java.util.function.*;

public class MainExample {

	private :static <T> void checkIsIn(Function<T[], Boolean> function, T[] obj){
		if(function.apply(obj).booleanValue()){
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
		Function<Integer[], Boolean> functionTwo = ClassExample::isIn;
		

	}

}
