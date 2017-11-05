public class DynamicMethodDispatch {

	public static void main(String[] args){

		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		ClassC classC = new ClassC();

		ClassC testClass;

		testClass = classA;
		testClass.testMethod();
 
		testClass = classB;
		testClass.testMethod();

		testClass = classC;
		testClass.testMethod();

		ClassC classAA = new ClassA();
		ClassC classBB = new ClassB();
		ClassC classCC = new ClassC();

		testClass = classAA;
		testClass.testMethod();
 
		testClass = classBB;
		testClass.testMethod();

		testClass = classCC;
		testClass.testMethod();


	}

}
