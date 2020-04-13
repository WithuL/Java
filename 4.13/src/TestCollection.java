import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {

    public static void main(String[] args) {
        //collection是借口，add，remove..都是抽象方法
        //这些方法在执行的时候，具体的行为取决于collection对应的真是对象的类型
        //1.实例化一个collection对象，collection是一个接口
        //必须new一个对应的类
        Collection<String> collection = new ArrayList<>();
        //2.使用Size / isEmpty
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        //3.使用add添加元素
        collection.add("我");
        collection.add("爱");
        collection.add("java");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println("===================================");
        //5.toArray 把集合转换成数组
        // String 也是继承自 Object 类
        // array 看似是一个Object数组,其实是String数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(collection);
        System.out.println("===================================");

        //6.for each 便利 collection
        //比较简单的遍历方式，如果要用while或者for  那么需要搭配迭代器
        for (String s : collection) {
            System.out.println(s);
        }
        System.out.println("===================================");

        //7.判断元素是否存在    contains内部会按照内容比较
        System.out.println(collection.contains("我"));
        System.out.println("===================================");
        //8.使用删除方法来指定元素
        collection.remove("我");
        System.out.println(collection);
        System.out.println("===================================");
        //9.使用 clear来清空所有元素
        collection.clear();
        System.out.println(collection);
        System.out.println("===================================");


    }
}
