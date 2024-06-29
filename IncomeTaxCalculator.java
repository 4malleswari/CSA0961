import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income from the user
        System.out.print("Enter the income: ");
        int income = scanner.nextInt();

        // Calculate taxable income (income - 2,50,000)
        int taxableIncome = income - 250000;

        // Calculate tax based on tax slabs
        double tax = 0;

        if (taxableIncome <= 0) {
            tax = 0;
        } else if (taxableIncome <= 250000) {
            tax = 0; // No tax for income <= 2,50,000
        } else if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.1; // 10% tax for income between 2,50,001 - 5,00,000
        } else if (taxableIncome <= 1000000) {
            tax = 25000 + (taxableIncome - 500000) * 0.2; // 20% tax for income between 5,00,001 - 10,00,000
        } else {
            tax = 125000 + (taxableIncome - 1000000) * 0.3; // 30% tax for income above 10,00,000
        }

        // Output the taxable income and calculated tax
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax = " + tax);

        scanner.close();
    }
}
