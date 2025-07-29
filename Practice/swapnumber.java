package Practice;

import java.util.Scanner;

public class swapnumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}