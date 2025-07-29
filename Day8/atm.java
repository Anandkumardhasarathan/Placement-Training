// package Day8;

import java.util.Scanner;

public class atm {

    public static void lines(){
    System.out.println("===================");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to AK Bank ATM");
        Scanner scan = new Scanner(System.in);
        lines();
        System.out.print("Enter the PIN :");
        int pin_number = 1234; // default pin
        float Account_Balance = 5000f;
        for(int attempt = 3;attempt>0;)
        {
            int pin = scan.nextInt();
            if(pin == pin_number)
            {
                lines();
                System.out.println("Welcome User");
                lines();
               for(int x = 1; x==1;)
               {
                     System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. Change PIN Number \n5. Exit");
                     lines();
                     System.out.print("Enter Yout choice : ");
                     int choice = scan.nextInt();
                     switch(choice)
                     {
                        case 1:
                            {
                                System.out.print("Enter the amount to be Credit : ");
                                int amount = scan.nextInt();
                               Account_Balance = Account_Balance + amount;
                               lines();
                               System.out.printf("Account Balance : %.2f", Account_Balance);
                               lines();
                               break;
                           } 
                        case 2:
                            {
                                System.out.print("Enter the Amount to be Debited :");
                                int amount = scan.nextInt();
                            if(amount<=Account_Balance)
                            {
                                Account_Balance = Account_Balance-amount;
                                System.out.println("Amount Debited Successfully");
                                lines();
                                System.out.printf("Available Balance : %.2f\n" , Account_Balance);
                            }
                            else
                            {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        }
                        case 3:
                            {
                                System.out.println("Available Balance = "+Account_Balance);
                                break;
                            }
                        case 4:
                            {
                                System.out.print("Enter Your pin to Change the PIN: ");
                                int oldPin = scan.nextInt();
                                if(oldPin == pin_number)
                                {
                                    System.out.print("Enter Your New PIN: ");
                                    int newPIN = scan.nextInt();
                                    if(newPIN!=pin_number)
                                    {
                                        pin_number = newPIN;
                                        System.out.println("Your Pin has been changed Successfully");
                                        lines();
                                        break;
                                    }
                                    else{
                                        System.out.println("You have Entered the same Old PIN Number\nPlease Enter your new PIN");
                                    }
                                }
                            else{
                                System.out.println("Incorrect PIN\n Try Again!...");

                            }
                        }
                    case 5:
                        {
                            x=0;
                            return;
                        }
                        
                }
               }
                break;
            }
            else 
            {
                --attempt;
                if(attempt>0)
                {
                    System.out.print("Enter the Correct PIN Number "+attempt+((attempt>1)? " Attempts left : ":"Attempt left : "));
                }
            }
         }
    }
}
