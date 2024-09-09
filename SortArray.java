import java.util.Scanner;

public class SortArray {
    public static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        // Traverse the array
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
            
                    mid++;
                    break;

                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array Size
        System.out.println("Enter array size:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Array Input
        System.out.println("Enter array elements (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        sort(arr);

        // Output the sorted array

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
}
