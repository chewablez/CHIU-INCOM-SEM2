package Week3Chiu;
import java.io.FileWriter;
import java.io.IOException;

public class W3A4Chiu {
public static void main(String[] args) {
	try (FileWriter writer = new FileWriter ("ChiuP4.txt", true)) {
		
		writer.write("\nToday I Learned FileWriter.");
		System.out.println("New Text Added.");
	} catch (IOException e) {
		System.out.println("Unable to update file.");
	}
}
}
