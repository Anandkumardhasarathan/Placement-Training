import java.util.Scanner;

public class unique {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//unique character : a c d
        char a[]={'a','c','d','d'};
        int c[] = new int[26];

        for(int i = 0;i<a.length;i++){
            c[a[i]-97]++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==1){
                System.out.print((char)(i+97));
            }
        } 

// unique numbers 235

        // int n = scan.nextInt();
        // int a[] = new int[n];
        // //geting the input from user
        // for (int i = 0; i < n; i++) {
        //     a[i] = scan.nextInt();
        // }


        // int c[] = new int[6];
        // for(int i = 0;i<a.length;i++){
        //     c[a[i]]++;
        // }
        // for(int i = 0;i<c.length;i++){
        //     if(c[i]==1){
        //         System.out.print(i +" ");
        //     }
        // }

//Duplicate Elements from Number : 1 4 //input : 1,2,1,3,4,4,1,5
        
        // int n = scan.nextInt();
        // int a[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     a[i]=scan.nextInt();
        // }
        // int c[] = new int[n+1];
        // for(int i = 0;i<a.length;i++){
        //     c[a[i]]++;
        // }
        // for(int i=0;i<c.length;i++){
        //     if(c[i]>1){
        //         System.out.print(i+ " ");
        //     }
        // }

//Sorting by Number of occurance : 2 3 5 4 4 1 1 1   //input : 1 2 1 3 4 4 1 5
//doubt
        // int n = scan.nextInt();
        // int a[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     a[i]=scan.nextInt();
        // }
        // int c[] = new int[n+2];
        // for(int i = 0;i<a.length;i++){
        //     c[a[i]]++;
        // }
        // for (int f = a.length; f >= 1; f--) {
        //     for (int i = 0; i < a.length; i++) {
        //         int num = a[i];
        //         if (c[num] == f) {
        //             for (int j = 0; j < f; j++) {
        //                 System.out.print(num + " ");
        //             }
        //             c[num] = 0;
        //         }
        //     }
        // }


    }
}
