import java.util.Scanner;

public class frequencyArray {
   public static void main(String ...arg) 
	{
	   int a[] = {1,2,1,3,4,4,1,5};
	   int c[] = new int[100];
	   for(int i = 0; i<a. length;i++)
	   {
	       c[ a[i] ]++;
	   }
	   for(int i = 0;i< c.length; i++) //assending
	   //for(int i = c.length-1;i>=0; --i) ///descending
	   {
	       for( ;c[i]>0 ;c[i]-- ) ///this will print the value if 4 is 2 times means it will print 2 times (44)
		   						  
	       System.out.print(i + " ");
	       //if(c[i]>0)
	   }
	}
}
