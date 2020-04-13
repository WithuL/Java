

class Student {
    public String name;
    public String sex;
}


public class MyArrayList <E> {

    private E[] array = (E[])new Object[100];
    private int size = 0;

    void add(E o) {
        array[size] = o;
        size++;
    }

    E get (int index) {
        return array[index];
    }

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("我爱A");

        String ret = myArrayList.get(0);
        System.out.println(ret );

        MyArrayList<Student> myArrayList1 = new MyArrayList<>();
        myArrayList1.add(new Student());
    }
}

