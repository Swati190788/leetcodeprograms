package org.example;

public class PalindromeNumber {
    public static void main(String args[]){
        int num = 121;
        int num1= num;
        int remainder = 0;
        int sum=0;

        for(int i =0; num!=0; i++){
            remainder=num%10;
            sum = (sum*10) + remainder;
            num = num/10;
        }

        if(num1 == sum){
            System.out.println("Number is palindrome: " +num1);
        }
        else{
            System.out.println("Number is not palindrome: " +num1);
        }
   }
}
