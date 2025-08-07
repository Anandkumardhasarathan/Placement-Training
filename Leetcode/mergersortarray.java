package Leetcode;
import java.util.*;
public class mergersortarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 6; 
        int[] nums2 = {2,5,6};
        int n = 3;

        if(m==0 && nums1.length==0 && n > 0){
            System.out.println(nums1);
            return;
        }
        else if(n == 0 && m > 0){
            System.out.println(nums2);
            return;
        }
        int count = 0;
        for(int i = 0;i<nums1.length;i++){
             if(nums1[i]==0 && count<nums2.length){
                     nums1[i] = nums2[count];
                     count++;
             }
        }
        Arrays.sort(nums1);
        for(int i = 0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
    }
}
