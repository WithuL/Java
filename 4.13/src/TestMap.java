import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        //1.实例化一个Map
        Map<String,String> map = new HashMap<>();

        //2.isEmpty,size;
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("=============================");

        //3.put 插入若干个键值对  key - > value,反向不行
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");

        //4.使用get查找元素  根据key找value
        System.out.println(map.get("及时雨"));
        System.out.println("=============================");
        System.out.println(map.getOrDefault("及时","没有找到"));

        //5.使用contains判断元素是否存在  注意 一个是查key 一个是查value;
        //containsKey比较高效，containsValue比较低效 o(1),o(n)
        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("宋江"));

        //6.使用循环便利map
        //此处的Entry表示条目，一个一个的键值对
        //对于map来说，保存的元素顺序和插入顺序无关
        //map内部对于元素顺序有自己的规则
        for(Map.Entry<String,String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //7.clear清空所有元素
        map.clear();
        for(Map.Entry<String,String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
