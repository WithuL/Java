import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Test {

    public static void main(String[] args) {
        List<String> link = new LinkedList<>();
        link.add("你好");
        System.out.println(link);

    }

}
