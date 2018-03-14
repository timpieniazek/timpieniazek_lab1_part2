package deliverables.grandcircus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;

import java.util.Locale;
import java.util.Scanner;

/* Tim Pieniazek - Deliverable Two */

public class Dates {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String firstInput;
		String secondInput;
		LocalDate firstDate;
		LocalDate secondDate;
		long yearsBetween;
		long monthsBetween;
		long daysBetween;
		long yearsAbs;
		long monthsAbs;
		long daysAbs;
		
		/* App intro block */
		int i;
		for (i = 0; i < 56; ++i) {
			System.out.print("*");
		}
		System.out.printf("%nLet's calculate the difference in time between two dates!%n");
		for (i = 0; i < 56; ++i) {
			System.out.print("*");
		}
		System.out.println("");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu", Locale.US)
				.withResolverStyle(ResolverStyle.STRICT);
		
		/* Do-While loop cycles through input until entered in the correct format. */
		firstDate = null;
		do {
			try {
				System.out.println("Please enter the first date as MM/DD/YYYY:");
				firstInput = scnr.nextLine();
				firstDate = LocalDate.parse(firstInput, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Error! Incorrect date format.");
			}
		} while (firstDate == null);
		
		secondDate = null;
		do {
			try {
				System.out.println("Please enter the second date as MM/DD/YYYY:");
				secondInput = scnr.nextLine();
				secondDate = LocalDate.parse(secondInput, formatter);
			} catch (DateTimeParseException e ) {
				System.out.println("Error! Incorrect date format.");
			}
		} while (secondDate == null);
		
		// TODO: Create a method to allow user to enter alternative date formats.
		
		yearsBetween = YEARS.between(firstDate, secondDate);
		monthsBetween = MONTHS.between(firstDate.plusYears(yearsBetween), secondDate);
		daysBetween = DAYS.between(firstDate.plusYears(yearsBetween).plusMonths(monthsBetween), secondDate);
		
		yearsAbs = Math.abs(yearsBetween);
		monthsAbs = Math.abs(monthsBetween);
		daysAbs = Math.abs(daysBetween);
		
		/* Output the absolute value, simple workaround in case firstDate > secondDate. */
		System.out.printf("There %s %d %s, %d %s, and %d %s between the two dates.",
				isAre(yearsAbs),
				yearsAbs, pluralize(yearsAbs, "year"),
				monthsAbs, pluralize(monthsAbs, "month"),
				daysAbs, pluralize(daysAbs, "day"));
	}
	
	public static String isAre(long count) {
		return (count - 1 < 0.001 && count -1 > -0.001 ? "is" : "are");
	}
	
	public static String pluralize(long count, String singular)
	{
	   return pluralize(count, singular, singular.concat("s"));
	}

	public static String pluralize(long count, String singular, String plural)
	{
	  return (count - 1 < 0.001 && count - 1 > -0.001 ? singular : plural);
	}
}