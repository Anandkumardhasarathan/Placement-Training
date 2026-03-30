import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // String rev = "";
        // for(int i = str.length()-1;i>=0;i--){
        //     reverse = reverse + str.charAt(i);
        // }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(str.equals(rev) ){
            System.out.println("The given string is Palindrome "+rev);
        }
        else{
            System.out.println("The given string is not palindrome "+rev);
        }
        
    }
}
