public class StaticBlockExample {

	private static final String message;

	static {
		message = "Hello, world";
	}

	public static void main(String[] args){
		System.out.println(message);
	}

}
