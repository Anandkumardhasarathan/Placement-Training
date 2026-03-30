package Practice;

public class stringExpand {
    public static void main(String[] args) {
        String s = "a2b3c4a4";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i=i+2){
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i+1));
            while(count > 0){
                sb.append(c);
                count--;
            }
        }
        System.out.println(sb.toString());
    }
}
