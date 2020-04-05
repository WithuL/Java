package bit.user;

import bit.book.BookList;
import bit.operation.IOperation;

abstract public class User {
    public String name;

    public abstract int menu();

    public User (String name){
        this.name = name;
    }

    public IOperation[] operations ;

    public void doOperation (int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
