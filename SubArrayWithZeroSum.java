import java.util.*;

public class SubArrayWithZeroSum {

    public static List<int[]> findSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        
        int prefixSum = 0;
        prefixSumMap.put(0, new ArrayList<>());
        prefixSumMap.get(0).add(-1);
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            if (prefixSumMap.containsKey(prefixSum)) {
                List<Integer> indices = prefixSumMap.get(prefixSum);
                
                for (int index : indices) {
                    result.add(new int[]{index + 1, i});
                }
            }
            
            prefixSumMap.putIfAbsent(prefixSum, new ArrayList<>());
            prefixSumMap.get(prefixSum).add(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        
        List<int[]> subarrays = findSubarrays(arr);
        
        for (int[] subarray : subarrays) {
            System.out.println("(" + subarray[0] + ", " + subarray[1] + ")");
        }
    }
}
