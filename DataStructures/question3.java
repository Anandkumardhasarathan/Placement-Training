package DataStructures;

import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ll = new ArrayList<>();

        //method 1
        while (true) {
            int a = scan.nextInt();
            if(a == -1)
                break;
            ll.add(a);
        }
       
        
        for(int i= 0;i<ll.size()-1;i++){
            if(ll.get(i)%2==0){
                ll.remove(i);
            }
            else{
                ll.add(i);
            }
        }
        System.out.println(ll);
        

//method 2
        //  while (true) {
        //     int a = scan.nextInt();
        //     if(a == -1)
        //         break;
        //     if(a%2!=0)
        //         ll.add(a);
        // }
        // System.out.println(ll);
    }   
}
