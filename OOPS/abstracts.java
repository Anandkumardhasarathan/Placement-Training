package OOPS;

abstract class hai
{
    void college()
    {
        System.out.println("mec");
    }
    abstract void rasipuram(); //in abstract method we should not use theb block of the code


}
public class abstracts extends hai 
{
    
    @Override  //for my reference to say that "(this method is overriden)"
    void rasipuram()
    {
        System.out.println("Message");  // In this we can't change the return type or access the abstract method but "(we can able to change the functionality of the abstract method by accessing the main class method )"
        //it cab be able to change the functionality of the rasipuram.
    }
    public static void main(String[] args) 
    {
        
        abstracts a = new abstracts();
        a.college();
        a.rasipuram();
    }
}
