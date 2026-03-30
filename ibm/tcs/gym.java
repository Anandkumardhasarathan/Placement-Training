package ibm.tcs;

import java.util.Scanner;

public class gym{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cost = 0;
        if(n<=0){
            System.out.println("Error");
            return;
        }

        if(n>=12){
            cost += (n/12) * 15000;
            n = n%12;
        }
        if(n>=9){
            cost += (n/9) * 12000;
            n = n%9;
        }
        if(n>=6){
            cost += (n/6) * 9000;
            n = n%6;
        }
        if(n>=3){
            cost += (n/3)*5000;
            n = n%3;
        }
        if(n!=0){
            System.out.println("Error");
        }
        else{
            System.out.println(cost);
        }
    }
}