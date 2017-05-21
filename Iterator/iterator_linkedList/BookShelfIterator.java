package iterator_linkedList;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private Book point;// 鎸囧悜褰撳墠鐨勮妭鐐�?

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.point = bookShelf.firstBook;
	}

	public boolean hasNext() {
		if (point == null) {
			return false;
		} else {
			if (point.next == null) {
				return false;
			} else {
				return true;
			}
		}
	}

	public Object next() {
		Book t = this.point;
		this.point = point.next;
		return t;
	}
}
