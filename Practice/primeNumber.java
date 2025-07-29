package Practice;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==0 && n!=2 || n%3==0 && n!=3 || n%5==0 && n!=5){
            System.out.println("not a prime Number");
        }
        for(int i = 7; i*i<n; i=i+2){
            if(n%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
