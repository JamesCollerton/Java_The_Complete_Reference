public class CoordinateArray<T extends TwoD> {

	private T[] coords;

	CoordinateArray(T[] coords){
		this.coords = coords;
	}

	public T[] getCoords(){
		return coords;
	}

	static public void printAllXYZ(CoordinateArray<? extends ThreeD> coords){
		ThreeD[] coordsArr = coords.getCoords();
		for(ThreeD coord: coordsArr){
			System.out.println("X " + coord.getX());
			System.out.println("Y " + coord.getY());
			System.out.println("Z " + coord.getZ());
		}
	}

}
