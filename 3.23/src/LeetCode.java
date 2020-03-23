public class LeetCode {
    public static boolean isHappy(int n) {
        while(n != 1) {
            int sum = 0;
            for(int i = n; i > 0 ;i /= 10){
                sum += (i % 10 )*(i % 10 );
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
