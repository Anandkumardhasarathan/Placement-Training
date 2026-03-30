package ibm.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int[][] arr = new int[n][2];

        // for(int i = 0;i<n;i++){
        //     arr[i][0] = scan.nextInt();
        //     arr[i][1] = scan.nextInt();
        // }

        // for(int i = 0;i<n-1;i++){
        //     for(int j = i ;j<n;j++){
        //         if(arr[i][0]>arr[j][0] || arr[i][0]==arr[j][0] && arr[i][1]>arr[j][1]){
        //             int temp1 = arr[i][0];
        //             int temp2 = arr[i][1];

        //             arr[i][0] = arr[j][0];
        //             arr[i][1] = arr[j][1];

        //             arr[j][0] = temp1;
        //             arr[j][1] = temp2;

        //         }
        //     }
        // }
        // for(int i = 0;i<n;i++){
        //     System.out.print(arr[i][0]+" "+arr[i][1]+" ");
        // }




        //method 2 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0;i<n;i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        // Arrays.sort(arr, (a, b) -> {
        //     if(a[0]!=b[0])
        // });


    }
}
