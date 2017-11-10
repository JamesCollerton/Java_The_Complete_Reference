package PackageOne;

import PackageOne.PackageOneClass;

public class PackageOneOtherClass {

	public PackageOneOtherClass(){
		System.out.println("" + new PackageOneClass().protectedInt);
	}

}
