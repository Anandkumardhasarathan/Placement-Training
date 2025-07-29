package DataStructures;

class ll
{
    Node head;
    ll() // constructor
    {
        head = null; // to initiailize the values        
    }
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert_at_last(int d)
    {
        Node newnode = new Node(d);
        if(null == head)
        {
            head = newnode;
        }
        else 
        {
            Node temp = head;
            for(  ;temp.next!=null; temp = temp.next );
            temp.next = newnode;
        }
    }
    // public void insert_at_begin(int d)
    // {
    //     Node newnode = new Node(d);
    //     if(head == null)
    //     {
    //         head = newnode;
    //     }
    //     else 
    //     {
    //         newnode.next = head;
    //         head = newnode;
    //     }
    // }
    // public void insert_at_middle(int d, int pos)
    // {  // pos - 3 , r = 3 
    //     Node newnode = new Node(d);
    //     if(head == null) 
    //     {
    //         head = newnode;
    //     }
    //     else 
    //     {
    //         Node r = head, t= head;
    //         for( ;pos>1 && (r!=null) ; t = r , r = r.next, pos--);
    //         t.next = newnode;
    //         newnode.next = r;
            
    //     }
    // }
    // public void delete_at_begin()
    // {
    //     if(head == null)
    //     {
    //         System.out.println("hey Stooopid list is empty to delete");
    //     }
    //     else 
    //     {
    //         head = head.next;  
    //     }
    // }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is Empty to display");
        }
        else 
        {
            Node temp = head;
            for( ;temp!= null ; )
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    
    public void delete_at_middle(int pos)
    {
        if(head == null) System.out.println("unable to delete");
        else 
        {
            Node r = head, t = head;
            for( ;pos>1 && (r!=null); t=r,r = r.next, pos-- );
            t.next = r.next;
        }
    }
    public void delete_at_last()
    {
        if(null == head) System.out.println("MT");
        else 
        {
            Node temp = head;
            for( ;temp.next.next != null ;temp = temp.next );
            temp.next = null;
        }
    }    
    // public int middle_node()
    // {
    //     if(head == null)
    //     {
    //         return 0;
    //     }   // length - 0
    //     else//            t
    //     {  // 50 10 40 90 12 10 14 20 100
    //         int length = 1;
    //         Node temp = head;
    //         for( ;temp!= null ; length++,temp = temp.next);
    //         length = length / 2;
    //         for(temp = head ;length>1 ; length--, temp = temp.next);
    //         return temp.data;
    //     }
    // }
    
    // public int middle_node_optimised()
    // {
    //     if(head == null)
    //     return 0;
    //     else 
    //     {
    //         Node rabbit = head, tortoise = head;
    //         for( ;rabbit!=null && rabbit.next !=null ; rabbit = rabbit.next.next, tortoise = tortoise.next );
    //         return tortoise.data;
    //     }
    // }
    
    // public int last_nth_node(int n)
    // {
    //     if(head == null)
    //     {
    //         return 0;
    //     }   // length - 0
    //     else//            t
    //     {  // 50 10 40 90 12 10 14 20 100
    //         int length = 1;
    //         Node temp = head;
    //         for( ;temp!= null ; length++,temp = temp.next);
    //         length = length - n;
    //         for(temp = head ;length>1 ; length--, temp = temp.next);
    //         return temp.data;
    //     }
    // }
    // public int last_nth_node_optimised(int n) //  n  -2 
    // {
    //     if(head == null)
    //     return 0;
    //     else 
    //     {
    //         Node r = head, t= head ;
    //         int count = 1;
    //         for( ;count<=n ;count++,  r= r.next);
    //         for( ;r!=null ;t = t.next, r = r.next);
    //         return t.data;
    //     }
    // }
    
    // public void create_loop()
    // {
    //     if(head == null) System.out.println("List is empty");
    //     else 
    //     {
    //         Node temp = head;
    //         for( ;temp.next != null ; temp = temp.next );
    //         temp.next = head.next.next;
    //     }
    // }
    // public void detect_loop()
    // {
    //     if(head == null) System.out.println("MT");
    //     else
    //     {
    //         Node r = head.next, t = head;
    //         for( ;r!=t && (r!= null && r.next != null) ; r = r.next.next, t = t.next );
    //         System.out.println((r==t)?"loop is detected":"Loop is not detected");
    //     }
    //  }
     
}
public class LinkedList 
{
    public static void main(String ...args)
    {
        ll l = new ll();
        l.insert_at_last(20);
        l.insert_at_last(10);
        l.insert_at_last(50);
        l.insert_at_last(70);
        l.insert_at_last(80);
        l.insert_at_last(90);
        l.display();
        // l.insert_at_begin(100);
        // l.delete_at_begin();
        // l.delete_at_begin();
        // l.insert_at_begin(300);
        // l.insert_at_begin(60);
        // l.insert_at_begin(120);
        // l.insert_at_begin(160);
        // System.out.println();
        // l.delete_at_last();
        // l.delete_at_last();
        // l.display();
        // System.out.println();
        // System.out.println("\nMiddle node: " + l.middle_node());
        // System.out.println("\nMiddle node (optimised): " + l.middle_node_optimised());
        // System.out.println("\nLast nth node: " + l.last_nth_node(4));
        // System.out.println("\nLast nth node (optimised): " + l.last_nth_node_optimised(3));
        // l.create_loop();
        // l.detect_loop();
        // l.display();
        // System.out.println();
        // l.insert_at_middle(99,2);
        // l.display();
        // l.delete_at_middle(4);
        // System.out.println();
        // l.display();
    }
}
