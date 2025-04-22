public class MedianFinder {
    public static double findMedian(double[] arr) {
        if (arr.length == 0) return -1.0;
        int mid = arr.length / 2;
        if (arr.length % 2 == 1) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }

    public static void main(String[] args) {
        double[] arr1 = {1, 3, 5, 7, 9};
        double[] arr2 = {2, 4, 6, 8};
        System.out.println("Median of arr1: " + findMedian(arr1)); 
        System.out.println("Median of arr2: " + findMedian(arr2)); 
    }
}