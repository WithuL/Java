public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int key = 4;
        reverseArray(array);
    }
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            int tmp = array[left];
            array[left++] = array[right];
            array[right--] = tmp;
        }
        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        int mid = (left + right)/2;
        while(left <= right) {
            if(array[mid]<key) {
                left = mid+1;
            }else if(array[mid] > key) {
                right = mid -1;
            }else {
                return mid;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
}
