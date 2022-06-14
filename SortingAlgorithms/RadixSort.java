package SortingAlgorithms;
import java.util.ArrayList;

public class RadixSort {
    /*
     * Radix Sort
     * 
     * Time Complexity:
     * 
     * Best - O(d(n + k))
     * Average - O(kn)
     * Worst - O(kn)
     *
     * Space Complexity:
     * 
     * Worst - O(n + k)
     */
    public static void radixSort(ArrayList<Integer> list) {
        int max = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }

        for(int place = 1; max / place > 0; place *= 10) {
            radixCountingSort(list, place);
        }
    }

    //Counting Sort Specific to Radix Sort for Finding Most Significant Digits
    public static void radixCountingSort(ArrayList<Integer> list, int place) {
        int n = list.size();

        int[] output = new int[n + 1];

        int max = list.get(0);
        for(int i = 1; i < n; i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; i++)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < n; i++)
            count[(list.get(i) / place) % 10]++;

        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Place the elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            output[count[(list.get(i) / place) % 10] - 1] = list.get(i);
            count[(list.get(i) / place) % 10]--;
        }

        for(int i = 0; i < n; i++) {
            list.set(i, output[i]);
        }
    }
}
