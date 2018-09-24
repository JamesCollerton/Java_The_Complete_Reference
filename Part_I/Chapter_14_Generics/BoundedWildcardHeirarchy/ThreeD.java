public class ThreeD extends TwoD {

	private int z;

	ThreeD(int x, int y, int z){
		super(x, y);
		this.z = z;
	};

	public int getZ(){
		return z;
	}

}
