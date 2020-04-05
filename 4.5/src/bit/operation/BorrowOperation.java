package bit.operation;

import bit.book.Book;
import bit.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{

    @Override
    public void work(BookList booklist) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书：");
        String name = scanner.nextLine();

        for(int i=0 ; i < booklist.getUsedSize();i++) {
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)) {
                if(book.isBorrowed()) {
                    System.out.println("已经被借出去了");
                    return ;
                }
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return ;
            }
        }
        System.out.println("没有这本书");
    }
}
