package WiproPractice;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fact = 1;
        int fact2 = 1;
        int i2 = 1;
        int i = 1;
        while (fact * (i + 1) <= n) {
            i++;
            fact *= i;
        }

        System.out.print(i); // i is the largest integer such that i! <= n
        if(fact<=n){
            n-=fact;       //8
            while(fact2*(i2+1)<=n){ //3*(3+1)<=8 == 12<=8
                i2++;       //3
                fact2 *= i2; //fact = 3*1 = 3
            }
        }
        System.out.println(i2);
        
    }
}