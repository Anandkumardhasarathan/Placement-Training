package Practice.Array.Frequency_Array;

public class sortingNumberByOccuranceNoRepeat {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,5};
        int c[] = new int[9];
        for(int i =0;i<arr.length;i++){
            c[arr[i]]++;
        }
        for(int j = 0;j<c.length;j++){
            if(c[j]>0){
                System.out.print(j +" ");
            }
        }

    }
}
