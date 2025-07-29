public class squarequestion {
    public static void main(String[] args){
        int num = 12;
        int a = num/10;
        int b = num%10;

        //algebraformula
        //(a^2+2ab=b^2)
        // <-----------
        int sb = b*b;
        int ab2= a*b*2;
        int sa = a*a;
        if(sb>9){
            ab2 = ab2+sb/10;
            sb = sb%10;
        }
        if(ab2>9){
            sa = sa+ab2/10;
            ab2 = ab2%10;
        }
        
        System.out.println(""+sa + ab2 + sb);

    }
}
