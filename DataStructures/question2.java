package DataStructures;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
    //method 1
        // int i = 0;
        // while (i>=0) {
        //     list.add((scan.nextInt()));
        //     if(list.get(i)== -1){
        //         list.remove(i);
        //         break;
        //     }
        //     i++;
        // }

        // System.out.println(list);
        // System.out.println("Enter target : ");
        // int target = scan.nextInt();
        // System.out.println((list.contains(target))?"Yes its present":"No not present");


    //method 2

        while (true) {
            int a = scan.nextInt();
            if(a==-1)
                break;
            list.add(a);
        }
        int target = scan.nextInt();
        System.out.println((list.contains(target))?"Yes":"No");
    }
}
