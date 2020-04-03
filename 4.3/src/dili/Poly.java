package dili;

interface IShape {
    void draw();
    public static final int num = 1;
}

class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}

class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}



public class Poly {
    public static void draw(IShape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        IShape shape = new Flower();
        draw(shape);
    }
}