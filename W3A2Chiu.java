package Week3Chiu;
import java.io.FileReader;
import java.io.IOException;

public class W3A2Chiu {
public static void main(String[] args) {
	try (FileReader reader = new FileReader("Charles.txt")) {
		int ch;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch);
			
		}
	} catch (IOException e) {
			System.out.println("Error reading file.");
		
	}
}
}
