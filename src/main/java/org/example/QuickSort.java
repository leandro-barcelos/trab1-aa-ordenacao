package org.example;

import java.util.Random;

public class QuickSort {

    Random r = new Random();
    public void sort(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private void quickSort(int[] v, int s, int e) {
        if (s < e) {
            int q = partition(v, s, e);
            quickSort(v, s, q - 1);
            quickSort(v, q + 1, e);
        }
    }

    private int partition(int[] v, int s, int e) {
        int randomPivo = r.nextInt(s, e + 1);
        swap(v, randomPivo, e);

        int q = s;

        for (int i = s; i < e; i++) {
            if (v[i] <= v[e]) {
                swap(v, q, i);
                q++;
            }
        }

        swap(v, q, e);

        return q;
    }

    private void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }
}
