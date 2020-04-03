class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
    public void dress (String color) {
        System.out.println(this.name+"穿了一件"+color+"的短袖");
    }
    public void play() {
        System.out.println(this.name+"不知道在干嘛");
    }
}
// 使用 extends 关键字来继承父类
class Boy extends Person {
    public Boy (String name) {
        //调用父类的构造方法
        super(name);
    }
    @Override
    public void play(){
        System.out.println(this.name+"正在打羽毛球");
    }
}

class Gril extends Person {
    public Gril (String name) {
        super(name);
    }
    @Override
    public void play() {
        System.out.println(this.name+"正在化妆");
    }
}

public class Practice{

    public static void main(String[] args) {
        Person He = new Person("他");
        Person She = new Gril("她");
        He.play();
        She.play();
    }
}
