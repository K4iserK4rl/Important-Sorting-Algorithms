package SortingAlgorithms;
import java.util.ArrayList;

public class SelectionSort {
    /*
     * Selection Sort
     * 
     * Time Complexity:
     * 
     * Best - O(n^2)
     * Average - O(n^2)
     * Worst - O(n^2)
     * 
     * Space Complexity:
     * 
     * Worst - O(1)
     */
    public static void selectionSort(ArrayList<Integer> list) {
        for(int x = 0; x < list.size(); x++) {
            for(int y = x + 1; y < list.size(); y++) {
                if(list.get(x) > list.get(y)) {
                    int tempX = list.get(x);
                    int tempY = list.get(y);
                    list.set(x, tempY);
                    list.set(y, tempX);
                }
            }
        }
    }
}
