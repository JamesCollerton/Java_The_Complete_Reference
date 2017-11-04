public class BitwiseOperators {
	
	public static void main(String[] args){
		
		byteExamples();		

	}

	public static void byteExamples(){

		byte exampleOne = 1;
		System.out.println("000I00001: " + exampleOne);

		byte exampleTwo = 2;
		System.out.println("00000010: " + exampleTwo);

		// The maximum values a byte can have are -128 and
		// 127, although -128 is the same as 128. Once you
		// get to 127 (01111111) then you wrap round to the
		// negative numbers. 
		byte exampleThree = -128;
		System.out.println("10000000: " + exampleThree);

		System.out.println("00000000: " + (exampleOne & exampleTwo));
		System.out.println("00000011: " + (exampleOne | exampleTwo)); 
		System.out.println("00000011: " + (exampleOne ^ exampleTwo));
		System.out.println("00000000: " + (exampleOne >> 1 ));
		System.out.println("00000001: " + (exampleTwo >> 1 ));

		// So this is the same as -128 + 64 = -64
		System.out.println("11000000: " + (exampleThree >> 1 ));

		System.out.println("01000000: " + (exampleThree >>> 1 ));
		System.out.println("00000100: " + (exampleTwo << 1 ));

		// Funky bitwise assignment
		exampleOne |= exampleTwo;
		System.out.println("00000011: " + exampleOne); 
		
		exampleTwo >>= 1;
		System.out.println("00000001: " + exampleTwo);

	}

}
