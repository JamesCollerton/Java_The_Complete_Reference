public class CallClass {

	public synchronized void call(String message) {

		try {
			System.out.println("[");
			Thread.sleep(500);
			System.out.println(message);
			Thread.sleep(500);
			System.out.println("]");
		} catch(Exception e){
			System.out.println("In exception in callable statement.");
		}

	}

}
