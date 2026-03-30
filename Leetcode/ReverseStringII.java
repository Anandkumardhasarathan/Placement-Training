public class ReverseStringII {
    public static void main(String[] args){
        String s = "abcdefg";
        int k = 2;
        String con = "";
        for(int i = 0;i<k;i++){
            con = s.charAt(i)+con;
        }
        for(int i = k;i<s.length();i++){
            con = con+s.charAt(i);
        }
        System.out.println(con);
    }
}
