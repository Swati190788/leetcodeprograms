package org.example;

public class TwoSum {
    public static void main(String[] args) {
      //  int nums[]= {2,7,11,15};

        //IA.m1();

        int nums[]={3,2,4};
        // int target=9;
        int target = 6;
        int output[]={0,0};

        System.out.println(nums.length);

        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>i;j--){
                int newnum = nums[j]+nums[i];
                if(newnum == target) {
                    output[0]=i;
                    output[1]=j;
                }
            }
              }

        System.out.print("[");
        for(int k=0;k<output.length;k++){
            System.out.print(output[k] +",");
        }
        System.out.print("]");

    }
}