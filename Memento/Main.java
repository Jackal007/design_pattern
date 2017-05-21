package Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("state:" + gamer);
            gamer.bet();
            System.out.println("money :$" + gamer.getMoney());
            System.out.println();
        }
    }
}
