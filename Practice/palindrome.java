package Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            reverse = reverse+name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}


