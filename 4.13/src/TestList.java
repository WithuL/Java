import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        //1.实例化一个List (接口)
        List<String> list = new ArrayList<>();

        //2.新增元素
        list.add("海绵宝宝");
        list.add("派大星");
        list.add("珊妮");

        //3.打印
        System.out.println(list);
        System.out.println("=======================");

        //4.使用下标访问
        //注意，如果当前list是ArrayList，那么get set 是比较高效的o(1);
        //如果当前是list 是 LinkedList，那么get set 是比较低效的o(n);
        System.out.println(list.get(0));
        System.out.println("=======================");
        list.set(0,"蟹老板");
        System.out.println(list);
        System.out.println("=======================");

        //5.截取部分内容
        System.out.println(list.subList(1,3));

        //6.重新构造一个List ( 这里的构造是浅拷贝 ，修改一方是不是会影响到另外一方，是的话就是浅拷贝)
        List<String> arrayList = new ArrayList<>(list);
        List<String> linkedList = new LinkedList<>(list);
        System.out.println("=======================");
        System.out.println(arrayList);
        System.out.println(linkedList);

        //7.基于现有List的引用进行强制转型 向下转换  不太明白
        ArrayList<String> arrayList1 = (ArrayList<String>)list;
        LinkedList<String> linkedList1 = (LinkedList<String>)list;

    }
}
