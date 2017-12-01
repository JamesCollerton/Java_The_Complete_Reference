import java.util.*;

public class ClassExample<T> {

	private T value;
	
	ClassExample(T value){
		this.value = value;
	}

	public boolean isIn(T[] valueArr){
		return Arrays.asList(valueArr).contains(value);
	} 

}
