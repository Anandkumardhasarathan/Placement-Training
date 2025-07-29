package Day9;

import java.util.Scanner;

public class calculator {

    public static int add(int a, int b){
        // System.out.println("Enter the Value of a & b");
        int result = a+b;
        System.out.println(result);
        return result;
    }
    public static int diff(int a, int b){
        int result = a-b;
        System.out.println(result);
        return result;
    }
    public static int mul(int a, int b){
        int result = a*b;
        System.out.println(result);
        return result;
    }
    public static int div(int a, int b){
        int result = a/b;
        System.out.println(result);
        return result;
    }
    public static void display(){
        System.out.println("1. Add\n2. Subraction \n3. Multiplication\n4. Division\n5. Exit");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 1;i==1; )
        {
             display();
             System.out.print("Enter the Operator : ");
             int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the Value of a & b : ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                add(a,b);
                break;
            case 2:
                System.out.print("Enter the Value of a & b : ");
                 a = scan.nextInt();
                 b = scan.nextInt();
                diff(a, b);
                break;
            case 3:
                System.out.print("Enter the Value of a & b : ");
                a = scan.nextInt();
                b = scan.nextInt();
                mul(a, b);
                break;
            case 4:
                System.out.print("Enter the Value of a & b : ");
                a = scan.nextInt();
                b = scan.nextInt();
                div(a, b);
                break;
            case 5:
                i=0;
                return;
        
            default:
                break;
        }
        }
        scan.close();
    }
}
