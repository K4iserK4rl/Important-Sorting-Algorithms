package SortingAlgorithms;
import java.util.ArrayList;

public class InsertionSort {
    /*
     * Insertion Sort
     * 
     * Time Complexity:
     * 
     * Best - O(n)
     * Average - O(n^2)
     * Worst - O(n^2)
     * 
     * Space Complexity:
     * 
     * Worst - O(1)
     */
    public static void insertionSort(ArrayList<Integer> list) {
        for(int x = 0; x < list.size(); x++) {
            int key = list.get(x);
            int y = x - 1;

            while(y >= 0 && list.get(y) > key) {
                list.set(y + 1, list.get(y));
                y--;
            }
            list.set(y + 1, key);
        }
    }
}
