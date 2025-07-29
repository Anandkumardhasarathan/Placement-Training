package Day5;

public class JosephusProblem {
    public static void main(String[] args){
        int n = 5;
        int s = 2;
        int binary = 1;
        for( ;binary<=n; binary <<=1);  //1<=5
            binary >>= 1; 
            int d = n-binary;
            int answer = (2*(d) + s) % n;
         System.out.println((answer == 0)? n : answer);
    }
}
