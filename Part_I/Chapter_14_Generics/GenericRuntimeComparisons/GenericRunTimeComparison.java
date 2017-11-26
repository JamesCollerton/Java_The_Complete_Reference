public class GenericRunTimeComparison {

	public static void main(String[] args){

		GenericOne<Integer> genOneInteger = new GenericOne<Integer>(1);	
		GenericTwo<Integer> genTwoInteger = new GenericTwo<Integer>(1, 1);	

		GenericOne<Integer> genOneString = new GenericOne<Integer>(1);	
		GenericTwo<Integer> genTwoString = new GenericTwo<Integer>(1, 1);	
		
		System.out.println("Currently checking generic one integer");
		instanceOfChecks(genOneInteger);

		System.out.println("Currently checking generic two integer");
		instanceOfChecks(genTwoInteger);

		System.out.println("Currently checking generic one string");
		instanceOfChecks(genOneString);

		System.out.println("Currently checking generic two string");
		instanceOfChecks(genTwoString);

	}

	private static void instanceOfChecks(GenericOne<?> gen){

		if(gen instanceof GenericOne<?>){
			System.out.println("Is gen one wildcard");
		}

//		if(gen instanceOf genOne<Integer>){
//			System.out.println("Is gen one integer");
//		}
//
//		if(gen instanceOf genOne<String>){
//			System.out.println("Is gen one string");
//		}

		if(gen instanceof GenericTwo<?>){
			System.out.println("Is gen two wildcard");
		}

//		if(gen instanceOf genTwo<Integer>){
//			System.out.println("Is gen two integer");
//		}
//
//		if(gen instanceOf genTwo<String>){
//			System.out.println("Is gen two string ");
//		}

	}

}
