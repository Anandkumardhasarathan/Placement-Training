package Day3;

public class leapyear {

    //for centuries years like 2000, 2100, it should (divide by 400)
    public static void main(String[] args) {
        int n = 2200;   
        if((n%400==0)||(n%4==0 && n%100!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }

    }
}
