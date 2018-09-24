public class VariableCapture {

	private static <T> void printMethod(FunctionalInterface<T> fi, T obj){
		System.out.println(fi.execute(obj));
	}

	public static void main(String[] args){

		int num = 9;

		printMethod(i -> num * i, 9);
		printMethod(s -> "String " + s, "Some string ");

	}

}
