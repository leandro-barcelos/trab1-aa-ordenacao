package org.example;

public class QuickInsert extends QuickSort{
    
    private int n = 150;
    public void quickSort(int[] v, int s, int e) {
        if (s < e) {
            if (e - s <= n) {
                InsertionSort i = new InsertionSort();
                i.sort(v, s, e);
            } else {
                int q = partition(v, s, e);
                quickSort(v, s, q - 1);
                quickSort(v, q + 1, e);
            }
            
        }
    }
    
}
