import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTypeAnnotationArray {
	MyTypeAnnotation[] value();
}
