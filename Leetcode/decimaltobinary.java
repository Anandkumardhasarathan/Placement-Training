package Leetcode;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = sc.nextInt(); 
        int number3 = number1+number2; //9
        String binary = "";
        int dec = number3; //9
        while (dec > 0) { //1>0
            binary = (dec % 2) + binary;  //b = 1%2->1 + " " binary = "1001"
            dec = dec / 2; // 2/2 = 1
        }
        System.out.println(binary);
    }    
}