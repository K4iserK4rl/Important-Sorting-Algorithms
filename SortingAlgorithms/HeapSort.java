package SortingAlgorithms;
import java.util.ArrayList;

public class HeapSort {
    /*
     * Heap Sort
     * 
     * Time Complexity:
     * 
     * Best - O(nlogn)
     * Average - O(nlogn)
     * Worst - O(nlogn)
     * 
     * Space Complexity:
     * 
     * Worst - O(1)
     */
    public static void heapSort(ArrayList<Integer> list) {
        int n = list.size();

        for(int i = n / 2 - 1; i >= 0; i--) {
            makeHeap(list, n, i);
        }

        for(int i = n - 1; i > 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            makeHeap(list, i, 0);
        }
    }

    //Function to create heap
    public static void makeHeap(ArrayList<Integer> list, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l < n && list.get(l) > list.get(largest))
            largest = l;

        if(r < n && list.get(r) > list.get(largest))
            largest = r;

        if(largest != i) {
            int temp = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, temp);

            makeHeap(list, n, largest);
        }
    }
}
