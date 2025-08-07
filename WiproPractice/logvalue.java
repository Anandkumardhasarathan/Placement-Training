package WiproPractice;
import java.util.*;
public class logvalue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = scan.nextDouble();
        System.out.print("Enter the base: ");
        double base = scan.nextDouble();

        if (n <= 0 || base <= 1) {
            System.out.println("Invalid input. Number must be greater than 0 and base must be greater than 1.");
            return;
        }

        double logValue = Math.log(n) / Math.log(base);
        System.out.printf("Logarithm of %.2f to the base %.2f is: %.4f%n", n, base, logValue);
    }
}
