package Practice.Array.Frequency_Array;

import java.util.Scanner;
//printing the number by descending occurance
public class allinone {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // int c[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i]=scan.nextInt();
        // }

        // for(int i = 0;i<arr.length;i++){
        //     c[arr[i]]++;
        // }
        // for(int i = c.length-1;i>0;i--){
        //     if(c[i]>0){
        //         System.out.print(i+" ");
        //     }
        // }

        //Elements not vowels [a,b,c,d,e,f,g] //op b,c,d,f,g
        
        // char a[]={'a','b','c','d','e','f','g'};
        // int c[] = new int[6];        
        // for(int i=0; i<a.length; i++){
        //     if((a[i]!='a')&&(a[i]!='e')&&(a[i]!='i')&&(a[i]!='o')&&(a[i]!='u')){
        //         System.out.print(a[i]+" ");
        //     }
        // }

//Elements repeated even times
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt()
        // char[] a={'a','b','c','a','b','d','b','c','d','c','c'};
        // int c[]=new int[12];
        // for(int i = 0;i<a.length;i++){
        //     if(a[i]>='a' && a[i]<='z'){
        //         c[a[i]-97]++;
        //     }
        // }

        // for(int i = 0;i<c.length;i++){
        //     if(c[i]>0 && c[i]%2==0){
        //         for(;c[i]>0;c[i]--){
        //             System.out.print((char)(i+97)+ " ");
        //         }
        //     }
        // }
       
//sort assending numbers
        //
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // int c[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i]=scan.nextInt();
        // }

        // for(int i = 0;i<arr.length;i++){
        //     c[arr[i]]++;
        // }
        // for(int i=0;i<c.length;i++){
        //     if(c[i]>0){
        //         for(;c[i]>0;c[i]--){
        //             System.out.print(i+" ");
        //         }
        //     }
        // }

//sort assending numbers with no repeat
        //
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // int c[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i]=scan.nextInt();
        // }

        // for(int i = 0;i<arr.length;i++){
        //     c[arr[i]]++;
        // }
        // for(int i=0;i<c.length;i++){
        //     if(c[i]>0){
        //             System.out.print(i+" ");
        //     }
        // }

//
            // int a[]={'d', 'd', 'd','a' ,'b','c','b' ,'a' ,'a','c','a'};
            // int c[]=new int[128];
            // for (int i = 0; i < a.length; i++) {
            //     c[a[i]]++;
            // }
            // for (int i = 0; i < c.length; i++){ 
            // for (; c[i] > 0; c[i]--) 
            // System.out.print((char)i +" ");
            // }


//elements not vowels
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        String con = "";
        for(int i = 0;i<str.length();i++){
            if((Character.toLowerCase(str.charAt(i))=='a') || (Character.toLowerCase(str.charAt(i))=='e') || (Character.toLowerCase(str.charAt(i))=='i')|| (Character.toLowerCase(str.charAt(i))=='o')||(Character.toLowerCase(str.charAt(i))=='u') ) {
                count++;
            }
            else{
                con = con + str.charAt(i);
            }
        }
        System.out.println("Vowels : "+count);
        System.out.println("Consonant : "+con);
        
        // int n = scan.nextInt();
        // char[] arr = new char[n];
        // for(int i = 0;i<n;i++){
        //     arr[i]=scan.next().charAt(0);
        // }

    }
}
