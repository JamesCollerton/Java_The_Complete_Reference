import PackageOne.PackageOneSubClass;
import PackageTwo.PackageTwoSubClass;
import PackageOne.PackageOneOtherClass;

public class AccessExampleMain {

	public static void main(String[] args){

		PackageOneSubClass packageOneSubClass = new PackageOneSubClass();
		PackageTwoSubClass packageTwoSubClass = new PackageTwoSubClass();

		PackageOneOtherClass packageOneOtherClass = new PackageOneOtherClass();

	}

}
