package org.example;

public class MergeSort implements Sort{

    public void sort(int[] v) {
        mergesort(v, 0, v.length - 1);
    }

    void merge(int v[], int e, int m, int d)
    {
        int n1 = m - e + 1;
        int n2 = d - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = v[e + i];
        for (int j = 0; j < n2; ++j)
            R[j] = v[m + 1 + j];

        int i = 0, j = 0;

        int k = e;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                v[k] = L[i];
                i++;
            }
            else {
                v[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            v[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            v[k] = R[j];
            j++;
            k++;
        }
    }

    void mergesort(int v[], int e, int d)
    {
        if (e < d) {

            int m = e + (d - e) / 2;
 
            mergesort(v, e, m);
            mergesort(v, m + 1, d);
 
            merge(v, e, m, d);
        }
    }
}
