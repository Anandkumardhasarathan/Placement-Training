package Leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class rainwatertappering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] original = arr;
        Arrays.sort(arr);
        int count = 0;
        int arrlen = arr.length-2;
        for(int i = n-1;i>=0;i--){ 
            int digit = arr[arrlen]-original[i]; 
            if(digit>0){
                count= count+digit;
            }
        }
        System.out.println(count);
    }
}
