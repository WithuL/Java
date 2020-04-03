
//父类
class Shape {
    protected void draw(){};
}

class Cryle extends Shape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

/*
        super关键字
        如果需要在子类中调用父类方法可以使用super关键字，
        super表示获取到父类实例的引用
        1.使用super来调用父类的构造器
        super(name);
        2.使用super来调用父类的方法
        super.dress("蓝色");  如果不加super那么方法就会认为是调用自己的dress方法；
 */
public class Poly {

    /*
    此时是类的调用者在编写drawMap这个方法，参数类型是Shape（父类）
    参数是shape，此时方法并不关注shape引用指向的是哪个类型的实例，
    所以此时shape这个引用调用的draw方法可能会有不同的表现，这种行
    为就成为多态
     */

    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cryle();
        Shape shape2 = new Rect();
        Shape shape3 = new Flower();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
}
