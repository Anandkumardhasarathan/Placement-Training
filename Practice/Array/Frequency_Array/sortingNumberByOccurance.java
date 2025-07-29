package Practice.Array.Frequency_Array;

public class sortingNumberByOccurance {
    public static void main(String[] args) {
        int a[]={1,2,1,3,4,2,5,1};
        int c[]=new int[10];
        for(int i = 0;i<a.length;i++){
            c[a[i]]++;
        }
        for(int j = c.length-1;j>=0;j--){
            for(;c[j]>0;c[j]--){
                System.out.print(j+" ");
            }
        }
    }
}
