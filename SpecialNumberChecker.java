public class SpecialNumberChecker {
    public static boolean isSpecialNumber(int number) {
        if (number < 10 || number > 99) return false;
        int d1 = number / 10;
        int d2 = number % 10;
        return (d1 + d2 + (d1 * d2)) == number;
    }

    public static void main(String[] args) {
        int number = 45; 
        if (isSpecialNumber(number)) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special number.");
        }
    }
}