package DataStructures;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] values = new int[n];
        for(int i = 0;i<n;i++){
            values[i]=scan.nextInt();
        }

        System.out.println("Enter the target value : ");
        int target = scan.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(values[i]==target){
                System.out.println("target fount");
                break;
            }
            count++;
        }
        System.out.println("O("+(count+1)+")");
    }
}
