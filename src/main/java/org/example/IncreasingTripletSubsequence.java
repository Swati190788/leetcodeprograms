package org.example;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        int arr[] = {2,1,5,0,4,6} ;
        int i=0;
        boolean output=false;
        for (i=0;i<arr.length-2;i++){
            if(arr[i]<arr[i+1] && arr[i+1]<arr[i+2]){
                output = true;
            }
        }

        System.out.println(output);
    }
}
