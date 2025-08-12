package optimizedcode;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();                                     //100 
        if(n%2==0 && n!=2 || n%3==0 && n!=3 || n%5==0 && n!=5){     //97
            System.out.println("Not a Prime Number");
            return;
        }
        for(int i = 7;i*4<n/2;i=i+2){    //<48      //2step - i*3<n/2, 1 step -> i * i<n/2, 4 step ->  i*4<n/2      
            if(n%i==0){                        
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}