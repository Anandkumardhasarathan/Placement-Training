package OOPS;

class pradeep{
    void nikitha(){
        System.out.println("Lover");
    }
}

class sathyaraj{
    void nikitha(){
        System.out.println("Daughter");
    }
}

public class polymorphism {

    void nikitha(){
        System.out.println("Brother");
    }
    public static void main(String[] args) {
        pradeep p = new pradeep();
        sathyaraj s = new sathyaraj();
        polymorphism r = new polymorphism();
        p.nikitha();
        s.nikitha();
        r.nikitha();
    }
}
