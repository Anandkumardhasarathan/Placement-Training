// package Day7;

public class primeNumber {
    public static void main(String[] args) {
        int n = 9973;
        if(n%2==0 && n!=2 || n%3==0 && n!=3 || (n%5) ==0 && n!=5){
            System.out.println("not a prime ");
        }
        //  below (i*i) -> help to reduce the iterations
        for(int i = 7;i*i<=n;i=i+2){
            if((n%i)==0){
                System.out.println("Not a prime");
                return;
            }
            System.out.println(i + " ");
            
        }
        System.out.println("Prime Number");
        
    }
}
