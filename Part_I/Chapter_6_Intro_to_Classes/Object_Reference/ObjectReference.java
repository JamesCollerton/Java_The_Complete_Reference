public class ObjectReference {

	public static void main(String[] args){

		ObjectOne objectOneA = new ObjectOne();
		ObjectOne objectOneB = objectOneA;

		objectOneA.setNumber(2);

		// Pass by reference
		System.out.println("Object A " + objectOneA.getNumber());
		System.out.println("Object B " + objectOneB.getNumber());

		// Pass by reference in function
		ObjectOne objectOneC = new ObjectOne();
		
		testFunction(objectOneC);
	
		System.out.println("Object C " + objectOneC.getNumber());

	}

	public static void testFunction(ObjectOne obj){
	
		obj.setNumber(3);
	
	}

}
