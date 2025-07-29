package DataStructures;
import java.util.*;

import Practice.armstrong;

public class collections {
    public static void main(String[] args) {
//Integer

                // <> -> wrapper
        // list.add(10);
        // list.add(50);
        // list.add(40);
        // System.out.println(list);
        // // insert last
        // list.addLast(100);
        // //insert first
        // list.addFirst(150);   
        // System.out.println(list);
        // //remove
        // list.remove(1);
        // System.out.println(list);
        // //iterator   
        // Iterator i = list.iterator();
        // while(i.hasNext()){
        //    System.out.print(i.next() + " ");
        // }

        // System.out.println(list.size());
        // //remove all the elements in arraylist
        // // list.removeAll(list);
        // // System.out.println(list);

        // //contains
        // System.out.println(list.contains(10));
//String
        // ArrayList <String> alist = new ArrayList<>();
        // alist.add("Hi");
        // alist.add("Hello");
        // alist.add("namasthe");
        // System.out.println(alist);
        // System.out.println(alist.hashCode());

        // Iterator l = alist.iterator();
        // while (l.hasNext()) {
        //     System.out.println(l.next());
        // }
        // System.out.println(alist.contains("namasthe"));
       
 //Character       
        // ArrayList<Character> ch = new ArrayList<>();
        // ch.add('a');
        // ch.add('b');
        // ch.add('c');
        // ch.add('d');
        // ch.add('e');
        // ch.add('f');
        // System.out.println(ch);
        // ch.remove(2);
        // System.out.print("After removing the index value : ");
        // Iterator c = ch.iterator();
        // while (c.hasNext()) {
        //     System.out.print(c.next()+ " ");
        // }  
        
        // ArrayList<Float> f = new ArrayList<>();
        // f.add(0.5f);
        // f.add(2.3f);
        // f.add(2.3f);
        // f.add(2.3f);
        // f.add(2.3f);
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(7);
        list2.add(5);

        System.out.println(list.containsAll(list2));


    }
}