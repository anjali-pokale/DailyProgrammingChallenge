

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate sum of first n natural numbers
        int totalSum = n * (n + 1) / 2;
        
        // Calculate sum of elements in array
        int arrSum = 0;
        for (int i=0;i<arr.length;i++) {
            arrSum += arr[i];
        }
        
        // Mssing number = difference between totalSum and arrSum
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; 
        int n = 5; 
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }
}
