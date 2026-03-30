package Practice;
import java.util.Scanner;


public class hcf {



    ///euclid theorem
    // public static int highestCommonFactor(int a, int b){
    //     if(b == 0) return a;
    //     return highestCommonFactor(b, a%b);

    // }
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();   
    //     int hcf = highestCommonFactor(a, b);
    //     System.out.println(hcf);
    // }


    //continuous subractions
    public static void main(String[] args) {
        int a = 70, b = 15;
        while(a != 0 && b != 0){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        } 
        int hcf = (a==0)?b:a;
        System.out.println(hcf);
    }
}
