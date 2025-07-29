// package Day7;

public class alphabet {
    public static void main(String[] args) {
        int n = 5;
        int m = (n/2) + 1;
        
    // A
     for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||j==n||i==1||i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


    //     b
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i==m || i==n || j ==n || j ==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // c
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1 || i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==2)||j==n||i==1||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // e
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i == m || i==n || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


        // F
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||i==1||i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


        // G
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || i == n || j==1 || (j==n && i>=m) || (i==m && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


        // j
            for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||j==n || i==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // I
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1||i==n||j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // J
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || j == m ||(i==n && j<=m) || (j==1 && i>=3)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println(); 


        // k
        for(int i = 1;i<=n;i++){
            for(int j = 1, k = 5;j<=n;j++,k--){
                if(j==2 || (k==i && k<=m) || (i==j && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // L
           for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1|| i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // M
        for(int i = 1;i<=n;i++){
            for(int j = 1, k = 5;j<=n;j++, k--){
                if(j==1 || j ==n ||(i==j && i<=m) || (k==i && k<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // N
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||j==n || (i==j)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        // O
                for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||i==1||i==n||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


        // p
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||(j==m && i<=m) || (i == m && j<=m) || (i == 1 && j<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((j==1 && i<=m) || (i==4 && j<=4) || j==n ||(i==1 && j<=4) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();


        // R
          for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||i==1||i==m || (j==n && i<=m) || (i==j && j>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }  
        System.out.println();
        
        // S
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


        // T
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==m || i ==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
            System.out.println();

        // U
         for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1 || j==n || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
            System.out.println();


        // v
        for(int i = 1;i<=n;i++){
            for(int j = 1,k=5;j<=n;j++,k--){
                if((i==j && i<=m) || (k==i && k<=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();


        // W

        for(int i = 1;i<=n;i++){
            for(int j = 1,k=5;j<=n;j++,k--){
                if(j==1 || j==n ||(i==j && i>=m) || (i==k && j<=m) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
            System.out.println();

        for(int i = 1;i<=n;i++){
            for(int j = 1,k=5;j<=n;j++,k--){
                if((i==j) || k==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();

        // Y
         for(int i = 1;i<=n;i++){
            for(int j = 1,k=5;j<=n;j++,k--){
                if((i==j && i<=m) || (k==i && k<=m) || (j==m && i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();


    //     Z
         for(int i = 1;i<=n;i++){
            for(int j = 1,k=5;j<=n;j++,k--){
                if(i==1 || i==n || (k==i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println();
    }
}
