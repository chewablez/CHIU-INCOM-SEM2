package Week3Chiu;
import java.io.*;
import java.util.*;
public class W3E1Chiu {
public static void main(String [] args) {
	Scanner input = new Scanner (System.in);
	int decision;
	do {
		System.out.println("");
	System.out.println("\nPlease Select");
	System.out.println("Type 1 to Add New Record");
	System.out.println("Type 2 to View Record");
	System.out.println("Type 3 to Exit");
	
	System.out.print("Input Number: ");
	decision = input.nextInt();
	
	switch (decision) {
	case 1:
		System.out.print("Enter Student Number: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("Enter First Name: ");
		String first = input.nextLine();
		System.out.print("Enter Last Name: ");
		String last = input.nextLine();
		System.out.print("Enter Course: ");
		String course = input.nextLine();
		try (
				FileWriter studrecord = new FileWriter("studentrecord.txt", true)) {
				studrecord.write("\n(Studentd ID: " + id + " | First Name: " + first + " | Last Name: " + last +
						" | Course: "+ course + ")");
				System.out.println("STUDENT RECORD ADDED.");
		} catch (IOException e) {
			System.out.println("Error Writing File.");
			
		}
		break;
	case 2:
		try (FileReader reader = new FileReader("studentrecord.txt")) {
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
				
			}
		} catch (IOException e) {
				System.out.println("Error reading file.");
			
		
	
	}
	
	}
	} while (decision != 3);
	
	input.close();
}
}