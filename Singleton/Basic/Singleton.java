package Singleton.Basic;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("singleton is created");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
