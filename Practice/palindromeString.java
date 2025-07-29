package Practice;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.next();

        String reverse = "";
        for(int i = words.length()-1;i>=0;i--){
            reverse = reverse + words.charAt(i);
        }
        System.out.println((words.equals(reverse))?"Palindrome":"Not a Palindrome");
    }
}