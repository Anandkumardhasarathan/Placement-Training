package Practice;

import java.util.*;
public class optimized_armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int originalNum = n;
        int sum = 0;
        int temp = Integer.toString(n).length();

        while (n>0) {
            int digit = n%10;
            sum += Math.pow(digit, temp);
            n = n/10;
        }
        // if(sum==originalNum)
        //     System.out.println("Armstrong Number for this "+originalNum+" : "+sum);
        // else
        //     System.out.println("Not a armstrong number");

        System.out.println((sum==originalNum)?"Armstrong":"Not a armstrong");


        //optimized method
    }
}
