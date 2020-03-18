import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {9,1,5,4,6,8,3,7};
        bubble(arr);
        Arrays.toString(arr);
        System.out.println(toString(arr));
    }

    //二分查找
    public static int binarySearch(int[] arr,int target) {
        int left = arr[0];
        int right = arr[arr.length-1];
        while(left <= right) {
            int mid = (left + right)/2;
            if(target > arr[mid]) {
                left = mid +1;
            }else if (target < arr[mid]) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //判断数组是否有序
    public static boolean isSorted(int[] arr) {
        for(int i = 1 ;i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true ;
    }

    // 冒泡排序
    public static void bubble(int[] arr) {
        for(int bound = 0; bound < arr.length; bound++) {
            for(int i = arr.length - 1; i > bound; i--) {
                if(arr[bound] > arr[i]) {
                    int tmp = arr[bound];
                    arr[bound] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        printArr(arr);
    }

    //求数组的平均值
    public static double avg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum/arr.length;
        return avg;
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
            if( i != arr.length-1 ) {
                ret += ",";
            }
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

    //打印数组
    public static void printArr(int[] arr) {
        for(int i = 0;i < arr.length; i++) {
            System.out.println( arr[i] );
        }
    }
}
