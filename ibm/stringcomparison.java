package ibm;

import java.util.Scanner;

public class stringcomparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int[] freq = new int[26];
        for(int i = 0;i<s.length();i+=2){
            char ch = s.charAt(i);
            int num = s.charAt(i+1)-'0';
            freq[ch - 'a'] += num;
        }

        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                System.out.print((char)(i+ 'a') + "" +freq[i]);
            }
        }
    }
}
