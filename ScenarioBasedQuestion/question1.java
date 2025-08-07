package ScenarioBasedQuestion;
//input : amount user has 100
        // total billing amount  63
        // denomination has shop keeper have 5
        // type of denomination shop keeper has 1,10,20,2,5

  
// remaining amount should be given in denominations is the output
//output: 20,10,5,2
// write the code to calculate the minimum number of denominations to be given to the user
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount user has:");
        int userAmount = sc.nextInt();
        System.out.println("Enter the billing amount:");
        int billingAmount = sc.nextInt();
        System.out.println("Enter the number of denominations shop keeper has : ");
        int n = sc.nextInt();
        int[] denomination = new int[n];
        System.out.println("Enter Denominations : ");
        for(int i = 0;i<n;i++){
            denomination[i] = sc.nextInt();
        }
        int remainingAmount = userAmount - billingAmount;
        System.out.println("Remaining amount given in the denominations: " + remainingAmount);
        Arrays.sort(denomination);
        List<Integer> result = new ArrayList<>();
        for(int i = n-1; i >= 0; i--) {
            while (remainingAmount >= denomination[i]) {    //0 >= 1 //false
                remainingAmount = remainingAmount - denomination[i]; // rm = 2-2 -> 0
                result.add(denomination[i]);                        //result = [20,10,5,2]
            }
        }
        System.out.println("Denominations to be given: " + result);
    }
}
