package OOPS;
interface parent1{
    void bike();
}

interface parent2{
    void car();
}

public class multipleInheritance implements parent1,parent2{

    @Override
    public void car(){
        System.out.println("Audi");
    }

    @Override
    public void bike(){
        System.out.println("BMW");
    }
    
    public static void main(String[] args) {
        multipleInheritance m = new multipleInheritance();
        m.bike();
        m.car();
    }
}
