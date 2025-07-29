package DataStructures;
import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>();
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);
        // System.out.println(ts);
        // Iterator i = ts.iterator();
        // while (i.hasNext()) {
        //     System.out.print(i.next()+ " ");
        // }
        // System.out.println();
        // for(int it : ts){
        //     System.out.print(it+ " ");
        // }
        // System.out.println();
        // ts.pollFirst();
        // System.out.println(ts);

        // ts.pollLast();
        // System.out.println(ts);


        //descending order  `````````````````````````````````````````````````
        // TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);
        // System.out.println(ts);

            //descending order  method 2  //doesn't remove duplicate
        // TreeSet<Integer> ts = new TreeSet<>((a,b)->(a<b)?1:-1);
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);           
        // System.out.println(ts);

          //ascending order  method 2  //doesn't remove duplicate
        // TreeSet<Integer> ts = new TreeSet<>((a,b)->(a>b)?1:-1);
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);           
        // System.out.println(ts);


          //descending order  method 2  //doesn't remove duplicate
        // TreeSet<Integer> ts = new TreeSet<>();
        // ts.add(10);
        // ts.add(9);
        // ts.add(4);
        // ts.add(7);
        // ts.add(9);           
        // System.out.println(ts);     


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(9);
        ts.add(4);
        ts.add(7);
        ts.add(9);           
        System.out.println(ts); 
        Iterator it = ts.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}