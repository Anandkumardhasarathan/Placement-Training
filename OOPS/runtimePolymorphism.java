package OOPS;

class dummy{
    void college(){
        System.out.println("Hi");
    }
}

public class runtimePolymorphism {
    void college(){
        System.out.println("MEC");
    }
    public static void main(String[] args) {
        runtimePolymorphism  r = new runtimePolymorphism();
        r.college();
    }
}
