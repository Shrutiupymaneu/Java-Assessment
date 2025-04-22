public class GrossPriceCalculator {
    public static double calculateGrossPrice(double netPrice, double taxRate) {
        return Math.round((netPrice / (1 + taxRate)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double netPrice = 100.0;
        double taxRate = 0.2; 

        double grossPrice = calculateGrossPrice(netPrice, taxRate);
        System.out.println("Gross Price: " + grossPrice);
    }
}