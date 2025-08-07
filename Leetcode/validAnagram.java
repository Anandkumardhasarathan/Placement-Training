package Leetcode;

import java.util.Arrays;

public class validAnagram {
 public static void main(String[] args) {
    String s = "anagram";
    String t = "nagara";
     char[] arr1 = s.toCharArray();
     char[] arr2 = t.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    boolean equal = true;

    if(arr1.length!=arr2.length) {
        equal = false;
        System.out.println(equal);
    }
    else{
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
             equal = false;
             System.out.println(equal);
                break;
            }
            else{
                equal = true;
            }
        }
        System.out.println(equal);

    }

        
        
 }   
}
