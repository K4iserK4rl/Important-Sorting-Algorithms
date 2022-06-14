import java.util.ArrayList;
import java.util.Collections;
import SortingAlgorithms.*;

public class SortingAlgorithms {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        fillList(list, 100);

        System.out.println("Original List: " + list);

        System.out.println();

        BubbleSort.bubbleSort(list);
        System.out.println("List After Bubble Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        SelectionSort.selectionSort(list);
        System.out.println("List After Selection Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        InsertionSort.insertionSort(list);
        System.out.println("List After Insertion Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        MergeSort.mergeSort(list);
        System.out.println("List After Merge Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        QuickSort.quickSort(list, 0, list.size() - 1);
        System.out.println("List After Quick Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        HeapSort.heapSort(list);
        System.out.println("List After Heap Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        CountingSort.countingSort(list);
        System.out.println("List After Counting Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        BucketSort.bucketSort(list);
        System.out.println("List After Bucket Sort: " + list);

        System.out.println();
        Collections.shuffle(list);

        RadixSort.radixSort(list);
        System.out.println("List After Radix Sort: " + list);
    }

    /*
     * fillList
     * 
     * Fills an empty arrayList with Integer values from [0,1000) according to the size passed to the method
     */
    public static void fillList(ArrayList<Integer> list, int size) {
        for(int x = 0; x < size; x++) {
            list.add((int) (Math.random() * 1000));
        }
    }
}