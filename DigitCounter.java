public class DigitCounter {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        int number = -12345;
        int digitCount = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + digitCount);
    }
}