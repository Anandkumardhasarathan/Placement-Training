// Convert uppercase to lowercase – return type, with arguments
package Day9;

import java.util.Scanner;
public class Main {

    public static String input(String name){
        String lower_case = name.toLowerCase();
        System.out.println("Converted to LowerCase String is : "+lower_case);
        return lower_case;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String user_input = scan.next();
        input(user_input);

    }
}
