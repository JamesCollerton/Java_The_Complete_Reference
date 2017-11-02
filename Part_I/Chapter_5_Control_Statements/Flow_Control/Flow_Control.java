public class Flow_Control {

	public static void main(String[] args){
		
		doWhile();
		useComma();		
		forEachMultidimensional();		
		continueLoops();
	
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

	public static void forEachMultidimensional(){

		int mdArr[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		System.out.println("");

		for(int[] x: mdArr){
			for(int y: x){
				System.out.println("" + y);
			}
		}

	}

	public static void continueLoops(){

		for(int i = 0; i < 10; i++){
			System.out.println("" + i);
			if(i > 5){
				continue;
			}
			System.out.println("Less than five");
		}

		outer: for(int i = 0; i < 10; i++){
			System.out.println();
			inner: for(int j = 0; j < 10; j++){
				System.out.print(j);
				if(j >= i){
					continue outer;
				}	
			}
			System.out.println("");		
		}
	
	}

}

