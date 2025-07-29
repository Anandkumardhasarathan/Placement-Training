// package Day7;








//   int thirdMax(int[] nums) {
//         Set<Integer> distinct = new HashSet<>();
//         for (int n : nums) {
//             distinct.add(n);
//         }
//         int thirdDistinct = -1; // Declare it early
//         if (distinct.size() <= 2) {
//             return Collections.max(distinct); // Return max if third doesn't exist
//         } else {
//             List<Integer> sorted = new ArrayList<>(distinct);
//             Collections.sort(sorted, Collections.reverseOrder());
//             thirdDistinct = sorted.get(2);
//         }
//         return thirdDistinct;
//     }








    

// public class leetcode {
//     // import java.util.*;

//         class Solution {
//             public int thirdMax(int[] nums) {
//                 Set<Integer> distinct = new HashSet<>();
//                 for(int n: nums){
//                     distinct.add(n);
//                 }
//                 if(distinct.size()<=2){
//                     return 2;
//                 }
//                 else{
//                 int thirdDistinct = nums[distinct.size()-1];
//                 System.out.println(thirdDistinct);
//             }
//                 return thirdDistinct;
//             }
// // }
   

// }
