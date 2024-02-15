package org.example;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        int a[] = {2, 2, 3};
        int b[] = new int[a.length];
        int product = 1;
        for (int i = 0; i < a.length; i++) {
            product = product * a[i];
        }
        // System.out.println(product);
        for (int j = 0; j < a.length; j++) {
            b[j] = product / a[j];
            System.out.println(b[j]);
        }
    }
}

