package bit.book;

public class Book {
    private String name;
    private String auther;
    private int price;
    private String type;
    private boolean IsBorrowed;

    public Book(String name,String auther,int price,String type) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "书名：'" + name + '\'' +
                ", 作者：'" + auther + '\'' +
                ", 售价：" + price +
                ", 类型：'" + type + '\'' +
                ", 是否借出：" + IsBorrowed ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return IsBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        IsBorrowed = borrowed;
    }
}
