import java.util.*;
public class W4A1Chiu {
static void ChiuAdd(int first, int second) {
	int sum = first + second;	
	System.out.println("Sum: " + sum);
}
static void ChiuSubtract(int first, int second) {
	int diff = first - second;
	System.out.println("Difference: " + diff);
}
static void ChiuMultiply(int first, int second) {
	int product = first * second;
	System.out.println("Product: " + product);
}
static void ChiuDivide(Double first, Double second) {
	Double divide = first / second;
	System.out.println("Quotient: " + divide);
}
static void ChiuMenu() {
	System.out.println("Please Choose a Function");
	System.out.println("1 to Add Numbers");
	System.out.println("2 to Subtract Numbers");
	System.out.println("3 to Multiply Numbers");
	System.out.println("4 to Divide Numbers");
}

public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	ChiuMenu();
	
	System.out.print("Deicison: ");
	int decision = input.nextInt();
	
	switch(decision) {
	case 1: {
		System.out.println("\nADDITION");
		System.out.print("Enter First Number: ");
		int first = input.nextInt();
		System.out.print("Enter Second Number: ");
		int second = input.nextInt();
		ChiuAdd(first, second);
		break; }
	case 2: {
		System.out.println("\nSUBTRACTION");
		System.out.print("Enter First Number: ");
		int first = input.nextInt();
		System.out.print("Enter Second Number: ");
		int second = input.nextInt();
		ChiuSubtract(first, second);
		break; }
	case 3: {
		System.out.println("\nMULTIPLICATION");
		System.out.print("Enter First Number: ");
		int first = input.nextInt();
		System.out.print("Enter Second Number: ");
		int second = input.nextInt();
		ChiuMultiply(first, second);
		break; }
	case 4: {
		System.out.println("\nDIVISION");
		System.out.print("Enter First Number: ");
		Double first = input.nextDouble();
		System.out.print("Enter Second Number: ");
		Double second = input.nextDouble();
		ChiuDivide(first, second);
		break; }
	default:
		System.out.println("INVALID OPTION");
		break;
} input.close();
}
}
