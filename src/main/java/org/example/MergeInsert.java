package org.example;

public class MergeInsert extends MergeSort{
    private int n = 150;

    void mergesort(int v[], int e, int d)
    {  
        if (e < d) {
            if (e - d <= n) {
                InsertionSort i = new InsertionSort();
                i.sort(v, e, d);
            } else {
                int m = e + (d - e) / 2;
                mergesort(v, e, m);
                mergesort(v, m + 1, d);
    
                merge(v, e, m, d);
            }
            
        }
    }

}
