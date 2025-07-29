public class multipleof11 {
    public static void main(String[] args) {
        int num = 198;
       
        if(num<100)
        {
            int firstDigit = num/10;
            int lastDigit = num%10;
            int middleDigit = firstDigit+lastDigit;
              if(middleDigit>9)
              {
                    int secondmiddledigit = middleDigit/10;
                    middleDigit = middleDigit%10;
                    firstDigit = firstDigit+secondmiddledigit;
                    System.out.println(""+firstDigit+middleDigit+lastDigit);
                    // System.out.println(secondmiddledigit);
               }
               else
               {
                   System.out.println(""+firstDigit+middleDigit+lastDigit);
               }
        }
        else
        {
            int firstDigit = num/100;
            int lastDigit = num % 100;
            int extract_middleDigit = num/10;
            int middleDigit = extract_middleDigit%10;
            int thirdDigit = middleDigit+lastDigit;
            int secondDigit = middleDigit+lastDigit;
            if(thirdDigit>9)
            {
                int secondthirdDigit = thirdDigit/10;
                secondDigit = secondthirdDigit+secondDigit;
                if(secondDigit>9){
                    int secDigit = secondDigit/10;
                    secondDigit = secondDigit+firstDigit;
                    secondDigit=secondDigit%10;
                    firstDigit = secDigit+firstDigit;
                    System.out.println(""+firstDigit+secondDigit+thirdDigit+lastDigit);
                }
            }


            System.out.println(middleDigit);
        }

    }
}
