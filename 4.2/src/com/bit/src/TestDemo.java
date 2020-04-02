package com.bit.src;

public class TestDemo {

    public static void main(String[] args) {
        Bird bird = new Bird("比翠丝");
        bird.fly();
        Cat car = new Cat("小喵");
        car.eat("猫粮");
        OrangeCat orangeCat = new OrangeCat("小橘");
        orangeCat.eat("小鱼");
    }
}
