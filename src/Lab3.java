import java.util.Formatter;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userInput = 0;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Good morning! Please enter a number: ");
			userInput = scan.nextInt();

			System.out.printf("%-10s %-10s %-10s \n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s \n", "======", "=======", "=====");

			for (int i = 1; i <= userInput; i++) {

				int numSquared = (int) Math.pow(i, 2);
				int numCubed = (int) Math.pow(i, 3);

				System.out.printf("%-10s %-10s %-10s \n", i, numSquared, numCubed);
			}
			scan.nextLine();
			System.out.println("Try again? (y/n)");
			choice = scan.nextLine();
		}

		System.out.println("Goodbye!");
		scan.close();
	}

}
