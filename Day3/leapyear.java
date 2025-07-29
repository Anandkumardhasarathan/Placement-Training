package Day3;

public class leapyear {

    //for centuries years like 2000, 2100, it should (divide by 400)
    public static void main(String[] args) {
        int n = 2200;   
        if(n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }

    }
}
