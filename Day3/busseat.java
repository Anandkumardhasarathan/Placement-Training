package Day3;
// import java.util.Scanner;

public class busseat {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        int u = 300;
        int n = 8;
        if( u%n==4 || u%n==1){
            System.out.println("Lower");
        }
        else if(u%n==5 || u%n ==2){
            System.out.println("Middle");
        }else if( u%n==6 || u%n ==3){
            System.out.println("Upper");
        }
        else if(n==7){
            System.out.println("Side Lower");
        }
        else if(u%n==0){
            System.out.println("Side Upper");
        }
        else {
            System.out.println("Invalid Seat Number");
        }
    }
}



///logic
/// 
/// if seat number is 50
/// which is divide by 8
/// 50/8 = remainder will be 2 
/// now 2nd seat is middle