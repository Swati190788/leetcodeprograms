package org.example;

public class MergeStringsAlternately {

    public static void main(String[] args) {

        int i = 0;
        int j=0;
        String word1 = "abc";
        String word2 = "pqrst";
        String newword ="" ;
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1>len2){
            for (i = 0; i < len2; i++) {
                newword = newword.concat(String.valueOf(word1.charAt(i)));
                newword = newword.concat(String.valueOf(word2.charAt(i)));
             }
            for(j=len2;j<len1;j++){
                newword=newword.concat(String.valueOf(word1.charAt(j)));
            }
        } else if (len1<len2) {
            for (i = 0; i < len1; i++) {
                newword = newword.concat(String.valueOf(word1.charAt(i)));
                newword = newword.concat(String.valueOf(word2.charAt(i)));
            }
            for(j=len1;j<len2;j++){
                newword=newword.concat(String.valueOf(word2.charAt(j)));
            }

        }
        else{
            for(i=0;i<len1;i++){
                newword = newword.concat(String.valueOf(word1.charAt(i)));
                newword = newword.concat(String.valueOf(word2.charAt(i)));
            }
        }
        System.out.println(newword);
    }
}
