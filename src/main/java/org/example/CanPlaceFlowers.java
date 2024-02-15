package org.example;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int arr[] = {0,1,0,0,0};
        int n =2;
        boolean output = false; //true in this case , if n = 2, output should be false
        int i=1;
        int count = 0;
        int count1=0;
        while(i < arr.length-1)
        {
            if (arr[i] == 0 && arr[i-1] == 1 && arr[i+1] == 1)
                output = false;
            else output = true;

            if (arr[i] == 1 && arr[i-1] == 0 && arr[i+1] == 0)
                output = true;
            else output = false;

            if (output = true)
                count++;
            i++;
        }

        for (i =0; i<arr.length;i++){
            if(arr[i]==1) count1++;
           // System.out.println(count1);
        }

        System.out.println("count: " +count);
        System.out.println("count1: " +count1);
        count = count - count1;

        if (count>=n)
            System.out.println("can place flower" +count +n);
        else
            System.out.println("cannot place flower" +count +n);
        //System.out.println(output);
    }
}


