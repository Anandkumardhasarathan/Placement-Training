package WiproPractice;

import java.util.Scanner;

public class factval {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]={1,1,2,6,24,120,720,5040};

        for(int i=a.length-1;i>=0;)
        {
            if(n<a[i])
            {
                i--;
            }
            else
            {
                while(n>=a[i])
                {
                    System.out.print(i);
                    n=n-a[i];
                }
                if(n==0)
                {
                    break;
                }
        }   
    }
    }
}




