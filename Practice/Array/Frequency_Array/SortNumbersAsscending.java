package Practice.Array.Frequency_Array;

import java.util.Scanner;

public class SortNumbersAsscending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int c[]=new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            c[arr[i]]++;
        }
        for(int i = 0;i<c.length;i++){
            for( ;c[i]>0;c[i]--){
                System.out.print(i+ " ");
            }
        }
    }
}
