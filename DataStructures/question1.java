package DataStructures;

import java.util.*;

public class question1 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> list= new ArrayList<>();
    System.out.print("Enter the size of list: ");
    int n = scan.nextInt();
    System.out.print("Enter your elements to be add in the List : ");
    for(int i = 0;i<n;i++){
        int element = scan.nextInt();
        list.add(element);
    }
    System.out.println(list);
    System.out.print("Enter the target element to find : ");
    int target = scan.nextInt();

    System.out.println((list.contains(target))?"Yes its present" : "No it is not in the list");
 }   
}
