package org.example;

public class ConcatenationofArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3,4,5};
        int b[] = new int[2 * a.length];
        int j = 0;
        int i = 0;

        for (i = 0; i < 2 * a.length; i++) {
            if (i < a.length) {
                b[i] = a[i];
            }
            if (i == a.length || i > a.length) {
                b[i] = a[j];
                j++;
            }

            System.out.println(b[i]);
        }
    }
}

