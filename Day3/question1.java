//Question: 




package Day3;
import java.util.Scanner;
public class question1
 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int userYear = scan.nextInt();
        int year = 2000;
        int totalYear=userYear-year;
        int LeapYear = (totalYear/4)+1;
        int nonleapYearOddDays = totalYear-LeapYear;
        int OddDays = nonleapYearOddDays+(LeapYear*2);
        int day = OddDays%7;
        switch (day) 
        {
            case 1:
                System.out.println("1st day of "+userYear+" is Sunday");
                break;
            case 2:
                System.out.println("1st day of "+userYear+" isMonday");
                break;
            case 3:
                System.out.println("1st day of "+userYear+" is Tuesday");
                break;
            case 4:
                System.out.println("1st day of "+userYear+" is Wednesday");
                break;
            case 5:
                System.out.println("1st day of "+userYear+" is Thursday");
                break;
            case 6:
                System.out.println("1st day of "+userYear+" is Friday");
                break;
            case 0:
                System.out.println("1st day of "+userYear+" is Saturday");
        
            default:
                break;
        }
        scan.close();
    }
}
