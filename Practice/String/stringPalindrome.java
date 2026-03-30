package Practice.String;
import java.lang.StringBuilder;

public class stringPalindrome {
    public static void main(String[] args) {
        
        //method 1
        // String input = "madam";
        // String[] arr = input.trim().split("");
        // StringBuilder sb = new StringBuilder();
        // for(int i = arr.length-1;i>=0;i--){
        //     sb.append(arr[i]);
        // }
        // System.out.println(input.equals(sb.toString())?"Palindrome":"Not a Palindrome");
    
        //method 2
        String inputn = "madam";
        String reverse = "";
        for(int i = inputn.length()-1;i>=0;i--){
            reverse = reverse+inputn.charAt(i);
        }
        System.out.println(inputn.equals(reverse)?"Palindrome":"Not a Palindrome");
    }
}
