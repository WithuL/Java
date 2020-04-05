package bit;

import bit.book.BookList;
import bit.user.AdminUser;
import bit.user.NormalUser;
import bit.user.User;

import java.util.Scanner;

public class Main {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份:");
        System.out.println("1.管理员");
        System.out.println("2.普通用户");
        int num = scanner.nextInt();
        if(num == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }

    }

}
