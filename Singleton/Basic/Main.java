package Singleton.Basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1==obj2");
        } else {
            System.out.println("obj1!=obj2");
        }
        System.out.println("End.");
    }
}
