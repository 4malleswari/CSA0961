import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Constants
        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_WEEK = 7;

        // Calculate years, weeks, and days
        int years = totalDays / DAYS_IN_YEAR;
        int remainingDays = totalDays % DAYS_IN_YEAR;
        int weeks = remainingDays / DAYS_IN_WEEK;
        int days = remainingDays % DAYS_IN_WEEK;

        // Display the results
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);
        
        scanner.close();
    }
}
