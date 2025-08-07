package Leetcode;
import java.util.*;
public class addtwostring{
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1+n2;
        String r = ""+result;
        System.out.println(r.format(r, n1,n2));
    }
}