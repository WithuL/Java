import java.util.ArrayList;
import java.util.List;

public class TestWrapperClass {

    public static void main(String[] args) {
        //包装类：用一个类把内置类包裹进去
        //内置类型 = > 包装类（装箱）
        Integer i = Integer.valueOf(10);
        Integer j = new Integer(10);

        //包装类 = > 内置类型（拆箱）
        int k = i.intValue();

        //(自动装箱拆箱)
        Integer a = 10;
        int b = a;

    }
}
