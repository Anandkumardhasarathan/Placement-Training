package Day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int principle = scan.nextInt();
        int rate = scan.nextInt();
        int time = scan.nextInt();

        float intrest = (principle*rate*time)/100.0f;
        float amount = principle + intrest;
        float discount = (0.2f/100)*100.0f;
        float finalAmount = amount - discount;  
        System.out.printf("%.2f\n",intrest);
        System.out.printf("%.2f\n",amount);
        System.out.printf("%.2f\n",discount);
        System.out.printf("%.2f\n",finalAmount);
    }
}