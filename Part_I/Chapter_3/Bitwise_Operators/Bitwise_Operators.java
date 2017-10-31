public class Bitwise_Operators {
	
	public static void main(String[] args){
		
		byteExamples();		

	}

	public static void byteExamples(){

		byte exampleOne = 1;
		System.out.println("00000001: " + exampleOne);

		byte exampleTwo = 2;
		System.out.println("00000010: " + exampleTwo);

		System.out.println("00000000: " + (exampleOne & exampleTwo));
		System.out.println("00000011: " + (exampleOne | exampleTwo)); 

	}

}
