package org.example;

public class FibonacciSeries {
    //1 1 2 3 5 8 13 21

    public static void main(String args[]){

        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for(int i=2;i<10;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println(arr[i]);
        }

    }


}
