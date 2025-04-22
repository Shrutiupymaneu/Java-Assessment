public class MaxNumber {
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("The maximum number is: " + getMax(a, b));
    }
}