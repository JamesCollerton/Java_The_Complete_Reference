public class GenericClass<T extends Number> {

	T[] arr;

	GenericClass(T[] arr){
		this.arr = arr;
	}

	public double average(){
		double total = 0;
		int n = 0;
		for(T number: arr){
			total += number.doubleValue();
			n++;
		}
		return total / n;
	}

	public boolean compareAverage(GenericClass<? extends Number> genericClass){
		if(genericClass.average() == average()){
			return true;
		}
		return false;
	}	

}
