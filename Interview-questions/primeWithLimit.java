import java.util.Scanner;

public class primeWithLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (number of primes to print): ");
        int n = sc.nextInt();   //5

        int count = 0;   
        int num = 2;     

        while (count < n) {        //2<5
            boolean isPrime = true;
            if (num < 2) {          //5<2 false
                isPrime = false;
            } else {                
                for (int i = 2; i <= Math.sqrt(num); i++) {     //i=2, 2<9; 3++
                    if (num % i == 0) { //3%2==0 //false
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {          //true
                System.out.print(num + " "); //2 3 5
                count++;    //1++=>2
            }
            num++; //4++ -> 5
        }
    }
}
