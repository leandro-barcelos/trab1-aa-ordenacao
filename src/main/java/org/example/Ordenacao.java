package org.example;

public class Ordenacao {
    static void printV(int[] v) {
        for (int j : v) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int V[] = { 12, 11, 13, 5, 6 };

//        InsertionSort i = new InsertionSort();
//        i.sort(V);

//        QuickSort q = new QuickSort();
//        q.sort(V);

//        MergeSort m = new MergeSort();
//        V = m.sort(V);

        printV(V);
    }
}
