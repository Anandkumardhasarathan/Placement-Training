package Practice;

public class decimaltbinary {
    public static void main(String[] args) {
        int n = 12;
        String binary = "";
        if(n==0){
            System.out.println(0);
            return;
        }
        while(n>0){
            int r = n%2;
            binary = r+binary;
            n = n/2;
        }
        System.out.println(binary);
    }
}