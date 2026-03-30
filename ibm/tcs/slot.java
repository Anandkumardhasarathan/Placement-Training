package ibm.tcs;

import java.util.Scanner;

public class slot{
   public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prev = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            int num = scan.nextInt();
            if(num>prev){
                count++;
                prev = num;
            }
        }
        System.out.println(count);
   }
}