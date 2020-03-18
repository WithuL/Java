import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        max(arr);
//        printArr(out);
//        String newArr = Arrays.toString(arr);
//        System.out.println(newArr);
//        System.out.println(Arrays.toString(arr));
        arr[0] = 10;
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row = 0; row < a.length; row++) {
            for(int col = 0; col < a[0].length; col++) {
                System.out.print(a[row][col]);
            }
            System.out.println();
        }
    }

    //找到数组中最大的元素
    public static void max(int[] arr) {
        int max = arr[0];
        for(int i = 1 ;i<arr.length ; i++) {
            if(arr[i] > arr[i-1]) {
                max = arr[i] ;
            }
        }
        System.out.println(max);
    }

    //实现数组的拷贝
    public static int[] copy(int[] arr) {
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;

    }

    public static String toString(int[] arr) {  //把数组变成字符串
         String ret = "[" ;
        for(int i = 0; i<arr.length; i++ ) {
            ret += arr[i];
        }
        ret += "]" ;
        return ret;
    }

    public static int[] transForm(int[] arr) {   //把数组变为原来的二倍
        int[] ret = new int[arr.length];
        for(int i = 0;i < ret.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }
    public static void printArr(int[] arr) {
        for(int i = 0;i < arr.length; i++) {
            System.out.println( arr[i] );
        }
    }
}
