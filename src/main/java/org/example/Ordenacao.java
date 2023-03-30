package org.example;
import java.util.Random;

public class Ordenacao {

    public static void printV(int[] v) {
        for (int j : v) System.out.print(j + " ");
        System.out.println();
    }

    public static void CriaVetRandom(int v[], int n) {
        Random r = new Random();
        for (int i = 0; i < n;i++) {
            v[i] = r.nextInt(0,1000);
        }

    }

    public static void Teste(int V[], Sort s) {
        long startTime = System.nanoTime();
        s.sort(V);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("N = " + V.length + "\nTempo =  " + ((double) timeElapsed / 1000000) + " ms");
    }

    public static void main(String[] args) {

        for (int n = 0; n <= 10000; n *= 10) {

            int[] V = new int[n];
            CriaVetRandom(V, n);

            int I[] = V;
            System.out.println("Insertion: ");
            Teste(I, new InsertionSort());

            int M1[] = V;
            System.out.println("Mergesort: ");
            Teste(M1, new MergeSort());

            int M2[] = V;
            System.out.println("Mergesort-Insertion: ");
            Teste(M2, new MergeInsert());

            int Q1[] = V;
            System.out.println("Quicksort: ");
            Teste(Q1, new QuickSort());

            int Q2[] = V;
            System.out.println("Quicksort-Insertion: ");
            Teste(Q2, new QuickInsert());
        }

        

    }

}
