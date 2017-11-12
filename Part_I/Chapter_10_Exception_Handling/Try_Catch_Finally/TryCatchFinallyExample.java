public class TryCatchFinallyExample {

	public static void main(String[] args){

		tryCatchFinallyHitCatch();
		tryCatchFinallyHitFinally();

	}

	public static void tryCatchFinallyHitCatch(){
		
		try {
			int a = 42 / 0;
		} catch(Exception e){
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
		}

	} 

	public static void tryCatchFinallyHitFinally(){

		try {
			int a = 1;
		} catch(Exception e){
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
		}

	}

}
