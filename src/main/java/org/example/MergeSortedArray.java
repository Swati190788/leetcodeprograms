package org.example;

public class MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,6,7};
        int nums2[] = {2,5,6};
         //output[] = [1,2,2,3,5,6];
        int length = nums1.length + nums2.length;
        int output[] = new int[length];
        int i= 0;
        int j=0;
        int k =0;

        while (i < nums1.length && j < nums2.length)
        {
              if (nums1[i] <= nums2[j]) {
                    output[k++] = nums1[i++];
              } else if (nums1[i] > nums2[j]) {
                    output[k++] = nums2[j++];
              }

        }

        while (i < nums1.length){
              output[k++]=nums1[i++];
        }

        while (j < nums2.length){
                output[k++]=nums2[j++];
        }

        for(int l =0;l<length;l++){
                System.out.println(output[l]);
            }
    }

}



