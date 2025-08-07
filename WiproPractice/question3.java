package WiproPractice;

import java.util.Scanner;

//input = cauliflower
//output = CLFLWR:6
public class question3 {

//     public static void main(String[] args) {
//         String input1 = "cauliflower";
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
//         for (char c : input1.toCharArray()) {
//             if ("aeiouAEIOU".indexOf(c) == -1) { // if not a vowel
//                 sb.append(Character.toUpperCase(c));
//                 count++;
//             }
//         }  
//         System.out.print(sb+":"+count);
// }
     public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Number of prime numbers between " + low + " and " + high + " is: " + count);
        sc.close();
    }

}
