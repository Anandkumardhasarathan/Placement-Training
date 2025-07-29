package Practice.Array.Frequency_Array;

public class duplicateelements {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,4,5,3};
        int c[] = new int[8];
        for(int i = 0;i<a.length;i++){
            c[a[i]]++;
        }
        for(int i = 0;i<c.length;i++){
            if(c[i]>1){
                System.out.print(i+ " ");
            }
        }
    }
}