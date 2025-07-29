public class fibonacci {
    public static void main(String[] args){
        int n =5,n3 = 0,n2 = 1,n1 =0;
        for(int i = 0;i<=n;i++,n3 = n1+n2,System.out.print(" "+n3), n1=n2, n2=n3);
    }
}
