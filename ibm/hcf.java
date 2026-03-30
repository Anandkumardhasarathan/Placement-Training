package ibm;

import java.util.Scanner;

// public class hcf{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int hcf = 1;
//         for(int i = 1;i<=a && i<=b;i++){
//             if(a%i==0 && b%i==0) hcf=i;
//         }
//         System.out.println("HCF of "+a+" and "+b+" is : "+hcf);
//     }
// }

public class hcf{

    public static int findHcf(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int hcf = findHcf(a, b);
        System.out.println(hcf);
    }
}