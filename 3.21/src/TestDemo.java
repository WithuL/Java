import java.util.Arrays;

public class TestDemo{

    public static void main(String[] args) {
        int[] arr = {1,6,2,3,4,5,8,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while((arr[left] & 1) != 1) {
            left++;
        }
        while((arr[right] & 1) != 0) {
            right--;
        }
        while(left < right) {
          int tmp = arr[left];
          arr[left] = arr[right];
          arr[right] = tmp;
          while((arr[left] & 1) != 1) {
              left++;
          }
          while((arr[right] & 1) != 0) {
              right--;
          }
        }
    }
}