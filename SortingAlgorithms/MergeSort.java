package SortingAlgorithms;
import java.util.ArrayList;

public class MergeSort {
    /*
     * Merge Sort
     * 
     * Time Complexity:
     * 
     * Best - O(nlogn)
     * Average - O(nlogn)
     * Worst - O(nlogn)
     * 
     * Space Complexity:
     * 
     * Worst - O(n)
     */
    public static void mergeSort(ArrayList<Integer> list) {
        int middle = list.size() / 2;

        ArrayList<Integer> left = new ArrayList<Integer>(middle);
        ArrayList<Integer> right = new ArrayList<Integer>(list.size() - middle);

        if(list.size() > 1) {
            for(int x = 0; x < middle; x++) {
                left.add(list.get(x));
            }

            for(int y = middle; y < list.size(); y++) {
                right.add(list.get(y));
            }

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }

    }

    //Merge Function
    public static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int x = 0;
        int y = 0;
        int z = 0;

        while(x < left.size() && y < right.size()) {
            if(left.get(x) < right.get(y)) {
                list.set(z++, left.get(x++));
            }
            else {
                list.set(z++, right.get(y++));
            }
        }

        while(x < left.size()) {
            list.set(z++, left.get(x++));
        }

        while(y < right.size()) {
            list.set(z++, right.get(y++));
        }
    }
}
