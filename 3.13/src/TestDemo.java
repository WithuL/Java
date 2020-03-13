public class TestDemo {
    public static void main(String[] args) {
        char pos1= 'A';
        char pos2= 'B';
        char pos3= 'C';
        hanoi(3,pos1,pos2,pos3);
    }
    //汉诺塔
    public static void move(char pos1,char pos3) {
        System.out.println(pos1+"移动到"+pos3);
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n == 1) {
            move(pos1,pos3);
            return;
        }
        hanoi(n-1,pos1,pos3,pos2);
        move(pos1 , pos3);
        hanoi(n-1,pos2,pos1,pos3);
    }
    //递归求阶乘
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    // 递归求和
    public static int sum2(int n) {
        if(n==1){
            return 1;
        }
        return n + sum2(n-1);
    }
    //打印每个数字的组成；
    public static void print(int n) {
        if(n < 10) {
            System.out.println(n);
        }else {
            print(n/10);
            System.out.println(n%10);
        }
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sum(int n ) {
        if(n < 10) {
            return n;
        }
        return (n % 10) + sum(n/10);
    }

    //递归求斐波那契数列
    public static void main2(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if(n == 1||n == 2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //青蛙跳台阶问题
    public static void main1(String[] args) {
        System.out.println(frogJump(6));
    }
    public static int frogJump(int n) {
        int a = 1;
        int b = 1;
        int sum = 1;
        for(int i = 2;i <= n;i++) {
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
