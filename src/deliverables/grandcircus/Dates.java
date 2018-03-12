package deliverables.grandcircus;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/* Tim Pieniazek - Deliverable 2 */

public class Dates {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstInput;
		String secondInput;
		LocalDate firstDate;
		LocalDate secondDate;
		long daysBetween;
		
		System.out.println("Let's calculate the difference in time between two dates!");
		System.out.println("Please enter the first date (YYYY-MM-DD):");
		firstInput = scnr.nextLine();
		firstDate = LocalDate.parse(firstInput);
		
		System.out.println("Please enter the second date (YYYY-MM-DD):");
		secondInput = scnr.nextLine();
		secondDate = LocalDate.parse(secondInput);
		
		// FIXME: Add an exception catch for wrong inputs
		// TODO: Use LocalDateFormatter to change allow a different input format
		
		daysBetween = DAYS.between(firstDate, secondDate);
		// TODO: Break down number of days into months and years
		
		System.out.println("There are " + daysBetween + " days between " + firstDate + " and " + secondDate + ".");
		
	}
}
