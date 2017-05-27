public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("a singleton has been created");
        slowdown();
    }
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
