import java.util.Arrays;

public class deletecolumn {
    public static void main(String[] args){
        String[] strs = {"cba","daf","ghi"};
        for(String str : strs){
            int count = 1;
            String temp = str;
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String check = new String(arr);
            if(check.equals(str)){
                count++;
                continue;
            }
            else{
                System.out.println(count);
                // count++;
            }
        }
    }
}
