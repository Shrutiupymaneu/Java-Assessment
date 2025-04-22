public class InflationCalculator {
    public static double calculateCompoundedInflation(double rate, int years) {
        return Math.round((Math.pow(1 + rate, years) - 1) * 10000.0) / 100.0;
    }

    public static void main(String[] args) {
        double rate = 0.03; 
        int years = 5; 

        double compoundedInflation = calculateCompoundedInflation(rate, years);
        System.out.println("Compounded Inflation over " + years + " years: " + compoundedInflation + "%");
    }
}