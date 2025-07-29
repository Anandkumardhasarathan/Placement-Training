// package Day7;

public class pattern {
    public static void main(String[] args){
        int n = 5;
        int m = (n/2)+1;
       //0
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((i==n || j ==n || j==1 || i==1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();

        //1
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();


        //2
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i==m || i==n || (j==n && i<=m) || (j==1 && i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();

        //3
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((i==1 || i == n || i ==m || j==n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
            System.out.println();
        //4

         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==1 && i<=m) || (i==m) || (j==m)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();

        //5

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i==m || i==n || (j==n && i>=m) || (j==1 && i<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
            System.out.println();
        //6
        
       for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==1 || i == m || i ==n || (j==n && i>=m))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }   
            System.out.println();

    //7

    
           for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((i==1 && j<=m) || j==m || i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
           }
            System.out.println();

        //    8
           for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i==m || i==n || j ==n || j ==1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
           }


        System.out.println();
        //9
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==1 && i<=3) || i == 1 || i == m || j ==n || i ==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        } 
            
    }
}
