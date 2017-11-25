public class GenericAndComparable {

	public static void main(String[] args){

		ComparableClass compClassOne = new ComparableClass(1);
		ComparableClass compClassTwo = new ComparableClass(2);

		System.out.println("Printing compare: " + compare(compClassOne, compClassTwo));
		System.out.println("Printing compare: " + compare(compClassTwo, compClassOne));
		System.out.println("Printing compare: " + compare(compClassOne, compClassOne));

	}

	private static <T extends Comparable<T>> int compare(T objOne, T objTwo) {

		try {
			return objOne.compareTo(objTwo);
		} catch(Exception e){
			System.out.println("In exception " + e);
		}	

		return 0; 
	}
	
}
