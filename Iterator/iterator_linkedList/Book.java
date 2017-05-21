package iterator_linkedList;

public class Book {
    private String name;
    protected Book next;

    public Book(String name) {
        this.name = name;
        this.next=null;
    }
    
    public String getName() {
        return name;
    }
}
