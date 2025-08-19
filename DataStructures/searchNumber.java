package DataStructures;

public class searchNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        for(int i = 0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("Index value of target value is :" +i);
                break;
            }   
        }
    }
}
