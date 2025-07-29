public class practice2 {
    public static void main(String[] args){
        int number = 85;
        int a = number/10;   
        int b = number%10;
        int a2 = a*a;
        int b2 = b*b;
        int ab2 = a*b*2;

        //a^2+2ab+b^2

        if(b2>9){
            ab2 = ab2+b2/10;
            b2 = b2%10;
        }

        if(ab2>9){
            a2 = a2+ab2/10;
            ab2 = ab2%10;
        }

        System.out.println(""+a2+ab2+b2);
    }
}
