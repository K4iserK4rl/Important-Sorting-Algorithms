package SortingAlgorithms;
import java.util.ArrayList;

public class QuickSort {
    /*
     * Quick Sort
     * 
     * Time Complexity:
     * 
     * Best - O(nlogn)
     * Average - O(nlogn)
     * Worst - O(n^2)
     * 
     * Space Complexity:
     * 
     * Worst - O(n)
     */
    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        if(low < high) {
            int partitionIndex = partition(list, low, high);

            quickSort(list, low, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, high);
        }
    }

    //Partition Function
    public static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);

        int i = (low - 1);

        int temp;
        
        for(int x = low; x <= high - 1; x++) {
            if(list.get(x) < pivot) {
                i++;
                temp = list.get(i);
                list.set(i, list.get(x));
                list.set(x, temp);
            }
        }
        temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }
}
