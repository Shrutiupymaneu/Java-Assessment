public class IncomeTaxCalculator {
    public static double calculateTax(double income) {
        double tax = 0.0;
        if (income > 1000000) {
            tax += 0.3 * (income - 1000000);
            tax += 0.2 * (1000000 - 500000);
            tax += 0.1 * (500000 - 250000);
        } else if (income > 500000) {
            tax += 0.2 * (income - 500000);
            tax += 0.1 * (500000 - 250000);
        } else if (income > 250000) {
            tax += 0.1 * (income - 250000);
        }
        return tax;
    }

    public static void main(String[] args) {
        double income = 1200000; 
        double tax = calculateTax(income);
        System.out.println("The income tax for an income of " + income + " is: " + tax);
    }
}