import java.util.function.*;

public class MainExample {

	private static <T> void execute(Consumer<T> consumer, T obj){
		consumer.accept(obj);
	}

	public static void main(String[] args){

		Consumer<String> consumer = ExampleClass::execute;
		execute(consumer, "Hello");		

	}

}
