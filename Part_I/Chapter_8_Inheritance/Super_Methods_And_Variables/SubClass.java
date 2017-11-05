public class SubClass extends SuperClass {

	private int hiddenVariable;

	SubClass(){
		this.hiddenVariable = 2;
	}

	public void hiddenMethod(){
		System.out.println("Hidden Method");
	}

	public void superHiddenMethod(){
		super.hiddenMethod();
	}

	public void printHiddenVariable(){
		System.out.println("Hidden Variable: " + hiddenVariable);
	}

	public void printSuperHiddenVariable(){
		System.out.println("Super Hidden Variable: " + super.hiddenVariable);
	}

}
