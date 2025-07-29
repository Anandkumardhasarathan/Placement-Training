package Practice;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = n *( n+1 )/2;
        System.out.println(answer);
    }
}
