public class DuplicateNumber {
    public static int findDuplicate(int[] arr) {
      
        int slow = arr[0];
        int fast = arr[0];
        
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        
        fast = arr[0];
        
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("Duplicate Number: " + findDuplicate(arr));  // Output: 3
    }
}
