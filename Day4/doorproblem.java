// import java.util.Scanner;
// public class doorproblem {
//     public static void main(String[] args)
//     {
//         // Scanner scan = new Scanner(System.in);
//         int a =1;
//         for(int i = 1;i<=10 ;i++){
//             System.out.println(a*a);
//             a++;
//         }
//     }
// }


///second method
/// 
public class doorproblem {
    public static void main(String[] args)
    {
        int doors = 1000;
        int a =1;                                       //a=3
        for( ;a*a<=doors;System.out.println(a*a),a++); //(3*3 = 9<1000) //9
        System.out.println("no of doors" +(a-1));
    }
}