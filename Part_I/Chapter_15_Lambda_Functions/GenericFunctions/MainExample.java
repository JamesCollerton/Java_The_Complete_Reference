public class MainExample {

	private interface MyFunc<T> {
		public int execute(T[] arr, T val);
	}

	private static <T> int execute(MyFunc<T> f, T[] arr, T val){
		return f.execute(arr, val);
	}

	public static void main(String[] args){

		System.out.println("Res " + execute(GenericFunctionClass::<Integer>countOccurences, new Integer[] {1, 1, 2}, 1));

	}

}
