package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int values[] = new int[n];

        for(int i = 0;i<n;i++){
            values[i]=scan.nextInt();
        }

        System.out.print("Enter the Target value : ");
        int target = scan.nextInt();

        int result = BinarySearch(values, target, 0, values.length-1);
        if(result!=-1){
            System.out.println("Element found at index : "+result);
        }
    }


//method 1
    // public static int BinarySearch(int[] values, int target){

    //     Arrays.sort(values);
    //     int left = 0;
    //     int right = values.length-1;

    //     while(left <= right){
    //         int mid = (left+right)/2;
    //         if(values[mid]==target){
    //             System.out.println("Target Found!");
    //             return mid;
    //         }
    //         else if(values[mid]<target){
    //             left = mid+1;
    //         }
    //         else{
    //             right=mid-1;
    //         }
    //     }

    //     return -1;
    // }
     public static int BinarySearch(int[] values, int target, int left, int right){

        Arrays.sort(values);
        if(left<=right){
            int mid = (left+right)/2;
            if(values[mid]==target){
                return mid;
            }
            else if(values[mid]<target){
                return BinarySearch(values, target, mid+1, right);
            }
            else{
                return BinarySearch(values, target, left, mid-1); 
            }
        }

        return -1;
    }
}
