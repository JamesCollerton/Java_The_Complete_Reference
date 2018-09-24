public class GenericClass<T extends Comparable<T>> implements GenericInterface<T> {

	private T[] objArr;

	GenericClass(T[] objArr){
		this.objArr = objArr;
	}
	
	public T min() {
		T min = objArr[0];
		
		for(int i = 1; i < objArr.length; i++) {
			if(min.compareTo(objArr[i]) > -1){
				min = objArr[i];
			}
		}

		return min;
	}

	public T max(){
		T max = objArr[0];
		
		for(int i = 1; i < objArr.length; i++) {
			if(max.compareTo(objArr[i]) < 1){
				max = objArr[i];
			}
		}

		return max;
	
	}

}
