class Test {
    private int a;
    public  void second() {
        a = 400;
        System.out.print(a);
    }
}

public class TestDemo{
    public static void main(String[] args) {
        Test test = new Test();
        test.second();
    }
}