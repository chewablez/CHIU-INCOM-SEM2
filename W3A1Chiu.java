package Week3Chiu;
import java.io.FileWriter;
import java.io.IOException;

public class W3A1Chiu {
	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("Charles.txt")) {
			writer.write("Welcome to Java File Handling!");
			System.out.println("Text Successfully Written.");	
		}
		catch (IOException e) {
			System.out.println("Error Writing to file.");
		}
	}

}
