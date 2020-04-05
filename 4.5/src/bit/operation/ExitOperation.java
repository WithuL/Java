package bit.operation;

import bit.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
