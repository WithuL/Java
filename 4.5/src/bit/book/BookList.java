package bit.book;

public class BookList {
    private Book[] book ;
    private int usedSize;

    public BookList() {
        this.book = new Book[10];
        this.book[0] = new Book("西游记","罗贯中",42,"小说");
        this.book[1] = new Book("三国演义","施耐庵",54,"小说");
        this.book[2] = new Book("水浒传","罗贯中",36,"小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos) {
        return book[pos];
    }

    public void setBook(int pos, Book book) {
        this.book[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
