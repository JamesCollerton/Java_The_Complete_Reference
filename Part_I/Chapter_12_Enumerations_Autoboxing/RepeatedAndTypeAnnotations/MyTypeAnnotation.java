import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyTypeAnnotationArray.class)
@Target(ElementType.FIELD)
public @interface MyTypeAnnotation {
	String name();
	int value() default 1; 
}
