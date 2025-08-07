package ScenarioBasedQuestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import DataStructures.collections;

public class question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of cities pincode :");
        int n = scan.nextInt();
        int[] city = new int[n];
        for(int i = 0;i<n;i++){
            city[i] = scan.nextInt();
        }
        //method1 with collections
        // Set <Integer> s = new HashSet<>();
        // for(int i = 0;i<city.length-1;i++){
        //     s.add(city[i]);
        // }

        // System.out.println(s.size());

        //method2  without using collections

        int ans = 0;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = i+1;j<n;j++){
                if(city[i]==city[j]){
                    count++;
                }
            }
            if(count==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
