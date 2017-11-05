public class VarArgsExample {

	public static void main(String[] args){

		testFunction(0, 1, 2);
		testFunction(3, 4, 5);		

	}

	private static void testFunction(int ... v){
	
		System.out.println("First number" + v[0]);
		
		for(int x: v){
			System.out.println("Num in Array" + x);
		}
	
		System.out.println("");
	
	}

}
