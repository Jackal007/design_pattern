package iterator_linkedList;

public class BookShelf implements Aggregate {
    public Book firstBook;

    public BookShelf(){
      firstBook=new Book("");
      firstBook.next=null;
    }

    public void appendBook(Book newBook) {
      newBook.next=null;
      Iterator it = iterator();
      while(it.hasNext()){
        it.next();
      }
      Book t=(Book)it.next();
      t.next=newBook;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
