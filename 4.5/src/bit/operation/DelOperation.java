package bit.operation;

import bit.book.Book;
import bit.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入你要删除的书籍");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for(int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                while(i < bookList.getUsedSize()-1){
                    Book book1 = bookList.getBook(i);
                    Book book2 = bookList.getBook(i+1);
                    book1 = book2;
                    i++;
                }
                bookList.setUsedSize(bookList.getUsedSize()-1);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("没有此书！");
    }
}
