package DataStructures;
//create a linkedlist class
class Linkedlist{

    //create a node Class
    Node head;
    Linkedlist(){
        head = null;
    }

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
//insert at last
    public void insert_at_last(int d){
        Node newnode = new Node(d);
        if(head == null){
            head = newnode;
        }
        else
        {
            Node temp = head;
            for( ; temp.next!=null; temp = temp.next);
            temp.next = newnode;
        }
    }
//insert at begin
    public void insert_at_begin(int d)
    {
        Node newnode = new Node(d);
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }

//find middle node
    public int find_middle_node()
    {
        if(head == null){
            return 0;
        }
        else{
            int length = 1;
            Node temp = head;                               //200 100 10 20 30 50
            for( ;temp!=null; length++, temp = temp.next); //length = 6;
            length = length/2;                              //length = 6/2 ->3
            for(temp = head ;length>1;length--,temp=temp.next );       // l = 2, temp=temp.next-100, 100-head;2>1;1,t->10,,,10-head;1>1 //false
            return temp.data;                               //temp.data(10)
        }
    }

//find middle node (optimized - ("Two pointers"))
    public int find_middle_node_optimized()
    {
        if(head == null)
        {
            return 0;
        }
        else{
            Node rabbit = head, tortoise = head;
            for( ;rabbit!=null && rabbit.next!=null; rabbit = rabbit.next.next, tortoise = tortoise.next);
            return tortoise.data;
        }
    }

//find last nth node
    public int find_last_nth_node(int n)
    {
        if(head == null)
        {
            return 0;
        }
        else{
            Node temp = head;
            int length = 1;
            for( ; temp!=null;length ++, temp = temp.next);
            length = length - n;
            for(temp = head;length>1;length--, temp = temp.next);
            return temp.data;
        }
    }

//find last nth node optimized (sliding window)
    public int find_last_nth_node_optimized(int n)
    {
        if(head==null)
        {
            return 0;
        }
        else{
            Node rabbit = head, tortoise = head;
            int count = 1;
            for( ;count<=n;count++, rabbit = rabbit.next );
            for( ;rabbit!=null;rabbit=rabbit.next, tortoise= tortoise.next);
            return tortoise.data;
        }
    }

//delete at last node

    public void delete_at_last_node(){
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp = head;
            for( ; temp.next.next!=null; temp = temp.next);
            temp.next=null;
        }
    }

//display
    public void display(){
        if(head == null){
            System.out.println("List is Empty");
        }
        else
        {
            Node temp = head;
            for( ; temp!=null; ){
                System.out.print(temp.data+" ");
                temp = temp.next; 
            }
        }
    }
}   

public class practiceLL {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        System.out.println("Linked List : ");
        l.insert_at_last(5);
        l.insert_at_last(15);
        l.insert_at_last(25);
        l.insert_at_begin(100);
        l.insert_at_begin(200);
        l.display();
        System.out.println();
        System.out.println("\nMiddle Node of the List : " + l.find_middle_node());  //find middle node
        System.out.println("\nMiddle Node of the List Optimized Way : " + l.find_middle_node_optimized());  //find middle node optimized
        System.out.println("\nLast nth node of the List : " + l.find_last_nth_node(2));  //find last nth node
        System.out.println("\nLast nth node of the List : " + l.find_last_nth_node_optimized(3));  //find last nth node optimized
        System.out.println();
        l.delete_at_last_node();
        l.display();
    }
}