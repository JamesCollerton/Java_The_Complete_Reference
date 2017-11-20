import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyTypeAnnotationArray.class)
@Target(ElementType.TYPE_USE)
public @interface MyTypeAnnotation {
	String name();
	int value() default 1; 
}
