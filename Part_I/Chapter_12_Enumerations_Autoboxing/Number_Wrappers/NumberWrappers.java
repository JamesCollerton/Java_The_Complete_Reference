public class NumberWrappers {

	public static void main(String[] args){

		int intValue = 1;
		double doubleValue = 1.0;

		int intAsIntFromInt = new Integer(intValue).intValue();
		double intAsDoubleFromInt = new Integer(intValue).doubleValue();
		
		int intAsIntFromDouble = new Double(intValue).intValue();
		double intAsDoubleFromDouble = new Double(intValue).doubleValue();

		// Can't do as it it is a lossy conversion.
		// int doubleAsIntFromInt = new Integer(doubleValue).intValue();
		//double doubleAsDoubleFromInt = new Integer(doubleValue).doubleValue();
		
		int doubleAsIntFromDouble = new Double(intValue).intValue();
		double doubleAsDoubleFromDouble = new Double(intValue).doubleValue();

		//

		System.out.println("Int as int from int: " + intAsIntFromInt);
		System.out.println("Int as double from int: " + intAsDoubleFromInt);
		System.out.println("Int as int from double: " + intAsIntFromDouble);
		System.out.println("Int as double from double: " + intAsDoubleFromDouble);
		System.out.println("Double as int from double: " + doubleAsIntFromDouble);
		System.out.println("Double as double from double: " + doubleAsDoubleFromDouble);

	}

}
