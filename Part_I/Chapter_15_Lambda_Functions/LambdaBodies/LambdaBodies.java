public class LambdaBodies {

	public static void main(String[] args){

		FunctionalInterface functionalInterface = (String input) -> {
			String output = "";
			for(int i = input.length() - 1; i >= 0; i--){
				output += input.charAt(i);
			}
			return output;
		};

		System.out.println("Lambda reverse: " + functionalInterface.getValue("Lambda"));
		System.out.println("Test reverse: " +functionalInterface.getValue("Hey, test"));

	}

}
