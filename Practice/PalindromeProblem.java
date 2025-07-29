package Practice;

import java.util.Scanner;

public class PalindromeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   //151
        int originalNum = n;
        int sum = 0;
        while (n>0) {
            int digit = n%10;
            sum = sum*10+digit;
            n=n/10;
        }
        System.err.println((originalNum==sum)?("Palindrome for this number "+originalNum+" is : "+sum):"Not a Palindrome Number");
    }
}
