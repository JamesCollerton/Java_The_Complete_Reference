import java.io.*;

public class CopyFiles {

	public static void main(String[] args){
		
		PrintWriter printWriter = new PrintWriter(System.out, true);

		try(
			FileInputStream fileInputStream = new FileInputStream("Files/File_1.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("Files/File_2.txt")
		) {

			int i;

			do {

				i = fileInputStream.read();
				printWriter.println(i);
				fileOutputStream.write(i);				
		
			} while (i != -1);

		} catch(IOException e){
			printWriter.println("IO Exception: " + e);
		}	

	}

}
