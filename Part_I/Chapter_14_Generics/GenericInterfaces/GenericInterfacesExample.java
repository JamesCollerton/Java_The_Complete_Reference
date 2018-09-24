public class GenericInterfacesExample {

	public static void main(String[] args){

		ComparableClass ccOne = new ComparableClass(1);
		ComparableClass ccTwo = new ComparableClass(2);
		ComparableClass ccThree = new ComparableClass(3);
		ComparableClass ccFour = new ComparableClass(4);

		ComparableClass[] ccArr = new ComparableClass[]{
							ccOne, ccTwo, ccThree, ccFour
						};

		GenericClass<ComparableClass> genCl = new GenericClass<ComparableClass>(ccArr);
	
		System.out.println("Min: " + genCl.min().getValue());
		System.out.println("Max: " + genCl.max().getValue());

	}

}
