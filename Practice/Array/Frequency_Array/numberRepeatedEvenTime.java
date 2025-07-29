package Practice.Array.Frequency_Array;

import java.util.Scanner;

public class numberRepeatedEvenTime {
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
        for(int j = 0;j<c.length;j++){
             if(c[j]>=2&&c[j]%2==0){
                System.out.print(j+ " ");
             }
        }
    }
}
