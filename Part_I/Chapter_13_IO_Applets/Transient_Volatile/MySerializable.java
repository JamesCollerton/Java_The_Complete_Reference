import java.io.*;

public class MySerializable implements Serializable {

	private String name;
	private transient int value;

	MySerializable(String name, int value){
		this.name = name;
		this.value = value;
	}

	public String getName(){
		return name;
	}

	public int getValue(){
		return value;
	}

}
