package Practice.String;
import java.lang.StringBuilder;

public class reverseastring {
    public static void main(String[] args) {
        //method 1
        // String s = "hello";
        // String[] r = s.trim().split("");
        // StringBuilder st = new StringBuilder();
        // for(int i = r.length - 1;i>=0;i--){
        //     st.append(r[i]);
        // }
        // System.out.println(st);

        //method2

        String s = "hello";
        StringBuilder st = new StringBuilder();
        st.append(s);
        st.reverse();
        System.out.println(st);

        
    }
}
