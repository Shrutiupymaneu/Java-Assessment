import java.util.Arrays;

public class SecondLargestFinder {
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) return Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 4, 2};
        int secondLargest = findSecondLargest(nums);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}