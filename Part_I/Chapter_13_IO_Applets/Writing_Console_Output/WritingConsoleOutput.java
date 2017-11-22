import java.io.*;

public class WritingConsoleOutput {

	public static void main(String[] args){

		PrintWriter printWriter = new PrintWriter(System.out, true);

		printWriter.println("Hello");

	}

}
