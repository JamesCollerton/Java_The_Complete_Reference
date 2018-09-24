public class FourD extends ThreeD {

	private int t;

	FourD(int x, int y, int z, int t){
		super(x, y, z);
		this.t = t;
	}

	public int getT() {
		return t;
	}

	public void printAllDimensions(){
		System.out.println("X " + getX());
		System.out.println("Y " + getY());
		System.out.println("Z " + getZ());
		System.out.println("T " + getT());
	}

}
