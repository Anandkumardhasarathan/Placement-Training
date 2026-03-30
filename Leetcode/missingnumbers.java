import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class missingnumbers {
     public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
    }
    public static void main(String[] args) {
        missingnumbers sol = new missingnumbers();
        int[] nums =  {5,3,6,1,12};
        sol.missingNumber(nums);
    }
}
