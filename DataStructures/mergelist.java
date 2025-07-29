package DataStructures;

import java.util.*;

public class mergelist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1= new ArrayList<>(); 
        while (true) {
            int a = scan.nextInt();
            if(a==-1)
                break;
            list1.add(a);
        }
        ArrayList<Integer> list2= new ArrayList<>(); 

        while (true) {
            int b = scan.nextInt();
            if(b==-1)
                break;
            list2.add(b);
        }

        list1.addAll(list2);

        Collections.sort(list1);
        System.out.print(list1);       

        
    }
}
