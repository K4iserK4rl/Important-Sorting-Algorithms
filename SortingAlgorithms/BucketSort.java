package SortingAlgorithms;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    /*
     * Bucket Sort
     * 
     * Time Complexity:
     * 
     * Best - O(n + k)
     * Average - O(n)
     * Worst - O(n^2)
     * 
     * Space Complexity:
     * 
     * Worst - O(n + k)
     * 
     */
    public static void bucketSort(ArrayList<Integer> list) {
        if(list.size() <= 0)
            return;

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] bucket = new ArrayList[list.size()];

        //Create Empty Buckets
        for(int i = 0; i < list.size(); i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        //Add Elements Into Buckets
        for(int i = 0; i < list.size(); i++) {
            int bucketIndex = list.get(i) / list.size();
            bucket[bucketIndex].add(list.get(i));
        }

        //Sort Elements of Each Bucket
        for(int i = 0; i < list.size(); i++) {
            Collections.sort(bucket[i]);
        }

        //Merging Buckets
        int index = 0;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0, size = bucket[i].size(); j < size; j++) {
                list.set(index++, bucket[i].get(j));
            }
        }
    }
}
