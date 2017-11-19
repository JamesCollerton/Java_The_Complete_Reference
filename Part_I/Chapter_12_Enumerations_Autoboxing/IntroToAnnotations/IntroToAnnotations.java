import java.lang.annotation.*;
import java.lang.reflect.*;

public class IntroToAnnotations {

	public static void main(String[] args){

		try {

			MyClass myClass = new MyClass();

			Class<?> myClassClass = myClass.getClass();
			Method myMethod = myClassClass.getMethod("myMethod");
			MyAnnotation myAnnotation = myMethod.getAnnotation(MyAnnotation.class);
			
			System.out.println(myAnnotation.name() + ", " + myAnnotation.value());

		} catch (Exception e){
		
			System.out.println("In main exception.");

		}

	}

}
