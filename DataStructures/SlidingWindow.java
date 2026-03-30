package DataStructures;

public class SlidingWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // Step 1: Find the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {   // i = 3, 3<3,2++
            windowSum += arr[i]; //windowSum = 3+arr[2](5) -> 8
        }
        maxSum = windowSum; //maxSum = 8

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {                  //i = 4;4<6;4++
            // Subtract the element going out and add the new one
            windowSum += arr[i] - arr[i - k]; //windowSum= windowSum(8) + arr[4](3) - arr[i - k](4-3) -> 10
            // Update max sum if needed
            maxSum = Math.max(maxSum, windowSum);  //maxSum = Math.max(maxSum(8), WindowSum(9));
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }

}