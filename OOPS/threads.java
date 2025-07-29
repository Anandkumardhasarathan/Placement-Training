package OOPS;

public class threads implements Runnable
{
    public void run()
    {
        // System.out.println("Hi " + threads.currentThread().getId());
        // System.out.println("bye  " + threads.currentThread().getId());
        // System.out.println("tata " + threads.currentThread().getId());
         System.out.print("Message");
    }

    public static void main(String[] args) 
    {
    //     for(int i = 1;i<=3;i++)
    //     {
    //         threads t = new threads();
    //         t.run();
    //     }

         threads t = new threads();
         Thread t1=new Thread(t);
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("terv");
        System.out.println(t1.getName());
    }
}
