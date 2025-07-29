package Practice.Array;

import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int even =0;
        int odd =0;
        for(int i = 0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        for(int i = 0;i<n;i++){
            if((arr[i]%2)==0) even++;
            else odd++;
        }
        System.out.println("Even :"+even+"\n"+"Odd :"+odd);

    }
}
