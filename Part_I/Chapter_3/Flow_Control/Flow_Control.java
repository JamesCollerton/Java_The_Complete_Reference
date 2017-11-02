public class Flow_Control {

	public static void main(String[] args){
		
		doWhile();
		useComma();		
	
	}

	public static void doWhile(){
		
		int i = 0;

		do {
			System.out.println("In do while."); 
		} while(i > 0);

	}

	public static void useComma(){

		int i, j;

		System.out.println("");	

		for(i = 0, j = 10; i < 10 && j > 0; i++, j--){
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}

	}
}

