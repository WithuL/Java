package mili;

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
}

//心情状态
interface IHappy {
    void happy();
}

interface ISad {
    void sad();
}

interface ILonely{
    void lonely();
}
//人物

class Kid extends Person implements IHappy{
    public Kid (String name) {
        super(name);
    }

    @Override
    public void happy() {
        System.out.println(this.name+"现在非常开心");
    }

}

class Adult extends Person implements ISad {

    public Adult (String name) {
        super(name);
    }

    @Override
    public void sad() {
        System.out.println(this.name+"现在有一点难过");
    }
}

class Teenager extends Person implements IHappy,ISad {
    public Teenager (String name) {
        super(name);
    }
    @Override
    public void happy() {
        System.out.println(this.name+"有时开心"+" ");
    }
    @Override
    public void sad () {
        System.out.println(this.name+"有时难过"+" ");
    }
}

class Alien extends Person implements IHappy,ISad,ILonely {
    public Alien (String name) {
        super(name);
    }
    @Override
    public void happy() {
        System.out.println(this.name+"有时开心"+" ");
    }
    @Override
    public void sad () {
        System.out.println(this.name+"有时难过"+" ");
    }
    @Override
    public void lonely() {
        System.out.println(this.name+"有时孤独"+" ");
    }
}
public class Mili {

    public static void happy(IHappy person) {
        person.happy();
    }
    public static void main(String[] args) {
        Alien alien = new Alien("保罗");
        happy(alien);
        Kid boy = new Kid("小李");
        happy(boy);
    }
}


