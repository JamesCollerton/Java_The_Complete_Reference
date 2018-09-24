public class GenericFunctionClass {

	public static <T> int countOccurences(T[] arr, T val) {
		int total = 0;
		
		for(T arrVal: arr) {
			if(arrVal.equals(val)) total++;
		}

		return total;
	}

}
