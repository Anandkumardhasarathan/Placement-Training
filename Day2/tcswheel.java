public class tcswheel {
    public static void main(String[] args){
        int w = 36;
        int v = 9;
        int tw = ((v*4)-w)/2;
        
        //for my reference (v*4)>=w
        if((w&1)==0 && (w>v) && ((v*4)>=w)){  
            System.out.println("Two Wheeler: "+tw+"  Four Wheeler:"+ (v-tw));
        }
        else{
            System.out.println("Invalid");
        }
    }
}
