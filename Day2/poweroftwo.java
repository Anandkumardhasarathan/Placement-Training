import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a & (a-1))==0?"Power of 2" : "Not a power of 2");
        sc.close();
    }
}
