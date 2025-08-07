package DataStructures;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<n;i++){
            s.push(scan.nextInt());
        }
        Stack<Integer> collect = new Stack<>();
        for(int i = s.size();i>0;i--){
            collect.push(s.pop());
        }
        System.out.println(collect);
    }    
}
