package optimizedcode;

import java.util.Scanner;
//based on time complexity 
public class fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact = 1;
        for(int i = 1,j=n;i<j;fact=fact*i,i++,j--);
        System.out.println(fact);
        
    }
}
