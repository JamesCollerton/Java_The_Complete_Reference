import java.lang.annotation.*;
import java.lang.reflect.*;

public class RepeatedAndTypeAnnotations {

	public static void main(String[] args){

		try {
			Class<?> myClass = new MyClass().getClass();

			Field[] classFields = myClass.getDeclaredFields();

			for(Field field: classFields){
				System.out.println(field);
				Annotation[] fieldAnnotations = field.getDeclaredAnnotations();
				for(Annotation annotation: fieldAnnotations){
					System.out.println(annotation.toString());
				}
			}

		} catch(Exception e){
			System.out.println("In main exception" + e);
		}

	}

}
