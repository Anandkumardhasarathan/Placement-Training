import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 1;                    //ans = 120
        for(int i = 1;i<n;i++, ans *=i); //i ( 5); (5)<=n(5) ; ans = ans(24)*i(5)
        System.out.println(ans);
        scan.close();
    }
}