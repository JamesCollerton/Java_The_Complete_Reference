import java.io.*;

public class TransientVolatile {

	public static void main(String[] args){

		serializeTest();
		MyClass myClass = new MyClass();

	}

	public static void serializeTest(){

		byte[] byteArray = null;

		try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ObjectOutputStream oos = new ObjectOutputStream(baos)){
		
			MySerializable mySerializable = new MySerializable("Name", 9);	
			oos.writeObject(mySerializable);
			byteArray = baos.toByteArray();

		} catch(Exception e){
			System.out.println("In writing object " + e);
		}

		try(ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		    ObjectInputStream ois = new ObjectInputStream(bais)){

			MySerializable mySerializable = (MySerializable) ois.readObject();

			System.out.println("Name " + mySerializable.getName());
			System.out.println("Value " + mySerializable.getValue());

		} catch(Exception e){
			System.out.println("In reading object " + e);
		}

	}

}
