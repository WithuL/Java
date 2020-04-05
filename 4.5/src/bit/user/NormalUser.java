package bit.user;

import bit.operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    public int menu() {
        System.out.println("哈喽 欢迎来到图书系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.查找图书");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出系统");
        int choice = scanner.nextInt();
        return choice;
    }
}
