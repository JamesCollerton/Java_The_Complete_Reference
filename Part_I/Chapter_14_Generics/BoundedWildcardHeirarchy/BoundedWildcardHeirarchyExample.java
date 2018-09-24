public class BoundedWildcardHeirarchyExample {

	public static void main(String[] args){

		FourD fourDOne = new FourD(1, 2, 3, 4);
		FourD fourDTwo = new FourD(5, 6, 7, 8);
		FourD fourDThree = new FourD(9, 10, 11, 12);
		FourD fourDFour = new FourD(13, 14, 15, 16);

		fourDOne.printAllDimensions();

		FourD[] fourDArr = new FourD[]{fourDOne, fourDTwo, fourDThree, fourDFour};

		CoordinateArray<FourD> fourDCoordArr = new CoordinateArray<FourD>(fourDArr);
		fourDCoordArr.printAllXYZ(fourDCoordArr);

	}

}
