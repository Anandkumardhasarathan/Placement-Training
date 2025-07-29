package Practice;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String binary = "";
        int num = n;
        while (num>0){
            int remainder = num%2;
            binary = remainder + binary;
            num = num/2;
        }
        System.out.print(binary+ " ");
    }
}
