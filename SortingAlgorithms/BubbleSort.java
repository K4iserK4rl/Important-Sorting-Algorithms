package SortingAlgorithms;
import java.util.ArrayList;

public class BubbleSort {
    /*
     * Bubble Sort
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
    public static void bubbleSort(ArrayList<Integer> list) {
        for(int x = 0; x < list.size() - 1; x++) {
            for(int y = list.size() - 1; y > 0; y--) {
                if(list.get(y) < list.get(y- 1)) {
                    int tempY = list.get(y);
                    int tempNextY = list.get(y - 1);
                    list.set(y, tempNextY);
                    list.set(y - 1, tempY);
                }
            }
        }
    }
}
