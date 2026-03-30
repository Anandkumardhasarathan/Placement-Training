package ibm.tcs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fraud {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<String> seen = new HashSet<>();
        int prevTime = -1;
        for(int i = 0;i<n;i++){
            String sender = scan.next();
            String receiver = scan.next();
            int timeStamp = scan.nextInt();
            int Amount = scan.nextInt();

            String key = sender +"-"+receiver;

            if(seen.contains(key)){
                System.out.println("Duplicate Transaction");
                return;
            }
            seen.add(key);

            if(prevTime!=-1 && (timeStamp-prevTime > 60)){
                System.out.println("Fraud Transaction Detected");
                return;
            }
            prevTime = timeStamp;
        }
        System.out.println("All Transactions are Valid");

    }
}
