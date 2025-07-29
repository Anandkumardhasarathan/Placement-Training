package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int fact = 1;               //fact(24)
        for(int i = 1;i<=n;i++){    //i(5)  i(5)<=5 i++(5)++
            fact = fact*i;          //1=24*5;  =>120
        }
        System.out.println(fact);
    }   
}
