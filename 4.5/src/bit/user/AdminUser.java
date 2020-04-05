package bit.user;

import bit.operation.*;

import java.util.Scanner;

public class AdminUser extends  User{

    public AdminUser(String name ) {
        super(name);
        //数组中存放的是Admin对应的操作。
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    public int menu() {
        System.out.println("哈喽 欢迎来到图书系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.打印书籍");
        System.out.println("0.退出系统");
        int choice = scanner.nextInt();
        return choice;
    }
}
