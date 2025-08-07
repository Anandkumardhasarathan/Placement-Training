package WiproPractice;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int result = 0;
        // int place = 1;

        // while (n > 0) {
        //     int d1 = n % 10;
        //     n /= 10;
        //     if (n > 0) {
        //         int d2 = n % 10;
        //         n /= 10;
        //         result += d1 * (place * 10) + d2 * place;
        //         place *= 100;
        //     } else {
        //         result += d1 * place;
        //         break;
        //     }
        // }
        // System.out.println(result);




        // method 2

        Scanner scan = new Scanner(System.in);
        int number = 0;
        // int n = scan.nextInt();
        for(int i = scan.nextInt();i!=0;number=number*10+(i%10),i/=10);
        for(int i = number;i!=0;System.out.print(i%100),i = i/100);

        //to find the length of the number integer
        // System.out.println((int)Math.log10(n)+1);

    }
}