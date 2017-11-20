import java.lang.annotation.*;
import java.lang.reflect.*;

public class RepeatedAndTypeAnnotations {

	public static void main(String[] args){

		try {
			Class<?> myClass = new MyClass().getClass();
			Field myField = myClass.getField("myField");

			Field[] classFields = myClass.getDeclaredFields();

			for(Field field: classFields){
				System.out.println("woooow");
				Annotation[] fieldAnnotations = myField.getDeclaredAnnotations();
				for(Annotation annotation: fieldAnnotations){
					System.out.println(annotation.toString());
				}
				
			}

			Annotation[] annotations = myField.getDeclaredAnnotations();

			for(Annotation annotation: annotations){
				System.out.println(annotation.toString());
			}

		} catch(Exception e){
			System.out.println("In main exception");
		}

	}

}
