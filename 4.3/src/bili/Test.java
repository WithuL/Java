package bili;

import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student o ) {
        if (this.score > o.score) {
            return -1;
        }else if( this.score < o.score) {
            return 1;
        }else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "[" +this.name + " " +
                + this.score +
                "]";
    }
}

public class Test {

    public static void main(String[] args) {
        Student[] student = new Student[]{
                new Student("小陈", 95),
                new Student("小李", 96),
                new Student("小毕", 97),
                new Student("小赵", 98)
        };
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}
