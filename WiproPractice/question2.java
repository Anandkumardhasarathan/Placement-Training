package WiproPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//input : orange
//input2 : apple
// output: rponlgea
//concate, remove duplicate and sort in descending
public class question2 {
    public static void main(String[] args) {
        String input1 = "orange";
        String input2 = "apple";
        String concat = input1+input2;
        char[] arr = concat.toCharArray();
        // System.out.println(arr);
        StringBuilder sb = new StringBuilder();
       HashSet<Character> h = new HashSet<>();
        for(char c : arr){
            if(!h.contains(c)){
                sb.append(c);
                h.add(c);
            }
        }
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        for(int i = chars.length-1;i>0;i--){
            System.out.print(chars[i]);
        }
    }
    
}
