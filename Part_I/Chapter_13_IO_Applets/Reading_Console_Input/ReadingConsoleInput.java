import java.io.*;

public class ReadingConsoleInput {

	public static void main(String[] args){

		readLines();

	}

	private static void readCharacters(){

		try {

			InputStreamReader inputReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputReader);

			char c;

			do {
				c = (char) bufferedReader.read();
			} while(c != 'q');

		} catch(Exception e){
			System.out.println("In main exception");
		}


	}

	public static void readLines(){

		try {

			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String str;

			do {

				str = bufferedReader.readLine();			

			} while("stop".equals(str));

		} catch(Exception e){
			System.out.println("In read line exception");
		}

	}

}
