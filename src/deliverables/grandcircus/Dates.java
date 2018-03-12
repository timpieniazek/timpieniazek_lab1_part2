package deliverables.grandcircus;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Scanner;

/* Tim Pieniazek - Deliverable Two */

public class Dates {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstInput;
		String secondInput;
		LocalDate firstDate;
		LocalDate secondDate;
		long yearsBetween;
		long monthsBetween;
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
		
		
		
		yearsBetween = YEARS.between(firstDate, secondDate);
		monthsBetween = MONTHS.between(firstDate.plusYears(yearsBetween), secondDate);
		daysBetween = DAYS.between(firstDate.plusYears(yearsBetween).plusMonths(monthsBetween), secondDate);
		
		System.out.println("There are " + Math.abs(yearsBetween) + " years, " + Math.abs(monthsBetween) + " months, "
				+ Math.abs(daysBetween) + " days between the two dates");
	}
}
