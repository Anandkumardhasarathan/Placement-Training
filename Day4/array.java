//optimise the program.

public class array {
    public static void main(String[] args){
        int arr[]={0,1,0,1,1};
        int count =0;
        for(int i = 0;i<arr.length;i++){
            count = (arr[i]==0)?count++:count--;
        }
        System.out.println((count>0)?true:false);
    }
}
