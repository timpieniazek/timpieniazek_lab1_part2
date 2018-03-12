package deliverables.grandcircus;

import java.time.LocalDate;
import java.util.Scanner;

/* Tim Pieniazek - Deliverable 2 */

public class Dates {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstInput;
		String secondInput;
		LocalDate firstDate;
		LocalDate secondDate;
		
		System.out.println("Let's calculate the difference in time between two dates!");
		System.out.println("Please enter the first date:");
		firstInput = scnr.nextLine();
		firstDate = LocalDate.parse(firstInput);
		
		System.out.println("Please enter the second date:");
		secondInput = scnr.nextLine();
		secondDate = LocalDate.parse(secondInput);
		
		// TODO: Parse date Strings into LocalDate format
		
		// TODO: Store year, month, and day variables for the time between date
		
		// TODO: Add output for the variables
		
	}
}
