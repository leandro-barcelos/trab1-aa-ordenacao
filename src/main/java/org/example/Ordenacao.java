package org.example;

public class Ordenacao {
    static void printV(int V[]) {
        int n = V.length;
        for (int i = 0; i < n; ++i)
            System.out.print(V[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int V[] = { 12, 11, 13, 5, 6 };

         InsertionSort i = new InsertionSort();
         i.sort(V);

//        QuickSort q = new Quicksort();
//        q.sort(V);

        printV(V);
    }
}
