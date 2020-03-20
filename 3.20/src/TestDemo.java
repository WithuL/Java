class Computer {
    public int price;
    public static String brand;
    public void play() {
        System.out.println("我可以用来看电影！");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.price = 4999;
        Computer.brand = "xiaomi";
        System.out.println(computer.price);
        System.out.println(Computer.brand);
        computer.play();
    }
}
