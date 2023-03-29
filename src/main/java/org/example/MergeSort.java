package org.example;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] v) {
        if (v.length == 1) {return v;}

        int[] m1 = sort(Arrays.copyOfRange(v, 0, v.length / 2));
        int[] m2 = sort(Arrays.copyOfRange(v, v.length / 2, v.length));
        return merge(m1, m2);
    }
    private int[] merge(int[] v1, int[] v2)
    {
        int n1 = v1.length;
        int n2 = v2.length;
        int i = 0;
        int j = 0;
        int z = 0;
        int[] vf = new int[n1+n2];

        while (i < n1 && j < n2){
            if (v1[i] <= v2[j]){
                vf[z] = v1[i];
                i++;
            } else {
                vf[z] = v2[j];
                j++;
            }
            z++;
        }

        while (i < n1) {
            vf[z] = v1[i];
            z++;
            i++;
        }

        while (j < n2) {
            vf[z] = v2[j];
            z++;
            j++;
        }

        return vf;
    }
}
