package SortingAlgorithms;
import java.util.ArrayList;

public class CountingSort {
    /*
     * Counting Sort
     * 
     * Time Complexity:
     * 
     * Best - O(n + k)
     * Average - O(n + k)
     * Worst - O(n + k)
     * 
     * Space Complexity:
     * 
     * Worst - O(k)
     */
    public static void countingSort(ArrayList<Integer> list) {
        int n = list.size();

        int[] output = new int[n + 1];

        // Find the largest element of the array
        int max = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list.get(i) > max)
            max = list.get(i);
        }
    
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[list.get(i)]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[list.get(i)] - 1] = list.get(i);
            count[list.get(i)]--;
        }

        //Copy sorted elements into original ArrayList
        for(int i = 0; i < n; i++) {
            list.set(i, output[i]);
        }
    }
}
