package OOPS;
interface Innerinheritance 
{
    void college(); //in interface we cannot use the normal method we can able to use only the abstract method. 
                    //Interface is don't have any block of code in methods.
}

public class interfaces implements Innerinheritance
{

    public void college()
    {   //in interface we should use the public access modifier to override it.
        System.out.println("MEC");
    }
    public static void main(String[] args) 
    {
        interfaces i = new interfaces();
        i.college();
    }
}
