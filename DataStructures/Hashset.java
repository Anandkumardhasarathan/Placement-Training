package DataStructures;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
          Set<Integer> ts = new HashSet<>();
        ts.add(10);
        ts.add(9);
        ts.add(4);
        ts.add(7);
        ts.add(9);
        System.out.println(ts);
        Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+ " ");
        }
        System.out.println();
        for(int it : ts){
            System.out.print(it+ " ");
        }

        // System.out.println();
        // ts.pollFirst();
        // System.out.println(ts);

        // ts.pollLast();
        // System.out.println(ts);


        //descending order  `````````````````````````````````````````````````
        // HashSet<Integer> ts = new HashSet<>(Comparator.reverseOrder());
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);
        // System.out.println(ts);

            //descending order  method 2  //doesn't remove duplicate
       


          //descending order  method 2  //doesn't remove duplicate
        // HashSet<Integer> ts = new HashSet<>();
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);           
        // System.out.println(ts);     


        
    }
}
