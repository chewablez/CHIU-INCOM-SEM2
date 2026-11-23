package Week3Chiu;
import java.io.*;
import java.util.*;
public class W3E1Chiu {
public static void main(String [] args) {
	Scanner input = new Scanner (System.in);
	int chiudecision;
	do { //Starts the do-while loop
		
		System.out.println(""); 
	System.out.println("\nPlease Select");
	System.out.println("Type 1 to Add New Record");
	System.out.println("Type 2 to View Record");
	System.out.println("Type 3 to Exit");
	
	System.out.print("Input Number: ");
	chiudecision = input.nextInt();
	
	switch (chiudecision) { 
	case 1: // Enter Student Information
		System.out.print("Enter Student Number: ");
		int chiuid = input.nextInt();
		input.nextLine();
		System.out.print("Enter First Name: ");
		String chiufirst = input.nextLine();
		System.out.print("Enter Last Name: ");
		String chiulast = input.nextLine();
		System.out.print("Enter Course: ");
		String chiucourse = input.nextLine();
		try (
				FileWriter chiustudrecord = new FileWriter("studentrecord.txt", true)) {
				chiustudrecord.write("\n(Studentd ID: " + chiuid + " | First Name: " + chiufirst + " | Last Name: " + chiulast +
						" | Course: "+ chiucourse + ")");
				System.out.println("STUDENT RECORD ADDED.");
		} catch (IOException e) {
			System.out.println("Error Writing File.");
			
		}
		break;
	case 2: // View Student Record
		try (FileReader reader = new FileReader("studentrecord.txt")) {
			int chiuch;
			while ((chiuch = reader.read()) != -1) {
				System.out.print((char) chiuch);
				
			}
		} catch (IOException e) {
				System.out.println("Error reading file.");
		} break;
	case 3: // Exits Program
		System.out.println("Exiting.");
		break;
		
	
		default: // Invalid input for numbers not 1-3
			System.out.println("Invalid Input.");
			break;
	
	
	} 
	}while (chiudecision != 3); // closes loop if the input is 3
	
	input.close();
}
}