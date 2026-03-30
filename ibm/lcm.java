package ibm;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int hcf = 1;
        for(int i =1;i<=a && i<=b ; i++){
            if(a%i==0 && b%i == 0){
                hcf = i;
            }
        }
        int lcm = a*b/hcf;
        System.out.println("LCM : "+lcm);
    }
}
