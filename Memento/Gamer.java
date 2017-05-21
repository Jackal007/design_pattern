package Memento;
import java.util.*;

public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private Memento memento;
    private static String[] fruitsname = {
        "Apple", "Banana", "Orange", "Mango",
    };
    public Gamer(int money) {
        this.money = money;
        this.memento = this.createMemento();
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("add money。create memento！");
            this.memento = this.createMemento();
        } else if (dice == 2) {
            money /= 2;
            System.out.println("money be half。restore！");
            this.restoreMemento(memento);
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("fruit:(" + f + ")get。");
            fruits.add(f);
        } else {
            System.out.println("nothing happend。");
        }
    }
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("yumy")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "yumy";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
