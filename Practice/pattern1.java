package Practice;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int m = (n/5)+1;
       for(int i = 1;i<=n;i++){
        for(int j = 1;j<=n;j++){
            if((i==n || j==1 || i==1 || j==n)){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
       }

        //  for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=n;j++){
        //         if((i==n || j==1 || i==1 || j==n)){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println("");
        // }
    }
}
