public class leastdigit {
    public static void main(String[] args){
        int n = 12;
        int firstDigit = n/10;
        int secondDigit = n%10;
        int first_digit = firstDigit+secondDigit;
        if(first_digit<9){
            int firstDigit1 = first_digit/10;
            int secondDigit1 = first_digit%10;
            int first_digit1 = firstDigit1+secondDigit1;
        }
        int divide = n/9;
        for(int i = 1; i<=divide;i++){
            System.out.println(9);
        }
        

    }
}
