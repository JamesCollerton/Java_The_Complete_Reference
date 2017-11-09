package PackageTwo;

import PackageOne.PackageOneClass;

public class PackageTwoSubClass extends PackageOneClass {

	public PackageTwoSubClass() { 
		System.out.println("" + publicInt);
		System.out.println("" + protectedInt);
		// System.out.println("" + defaultInt);
		// System.out.println("" + privateInt);
	}

}
