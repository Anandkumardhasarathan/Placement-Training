package OOPS;

public class compiletimePolymorphism {
    public void add(int a, int b){
        System.out.println(a+b);
    }    
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        compiletimePolymorphism c = new compiletimePolymorphism();
        c.add(10, 20);
        c.add(10,30 ,30);
    }
}
