import java.util.*;
public class secondlargestnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=scan.nextInt();
        }                           
        ///20 30 40 50 10
        int first = Integer.MIN_VALUE;  
        int second = Integer.MAX_VALUE; 

        for (int num : arr) { 
          if (num > first) {          
              second = first;
              first = num;
          } else if (num > second && num != first) { 
              second = num;
          }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("No 2nd largest element");
        }
        else{
            System.out.println("Second Largest Element is : "+second);
        }

    }
}
