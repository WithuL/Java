public class Sum {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sumMax(nums));
    }

    //0~n中缺失的数字
    public int missingNumber(int[] nums) {
        int i;
        for(i = 0;i < nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return i;
    }


    //统计一个数字在排序中出现的次数
    public int search(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    //连续子数组的最大和
    public static int sumMax(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int j = -2147483648;
        int count = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum += nums[i];
            if(sum <=0 ) {
                sum = 0;
            }
            if(sum > max) {
                max = sum ;
            }
            if(nums[i] > j) {
                j = nums[i];
                count++;
            }
        }
        if(count == nums.length) {
            return j;
        }
        return max;
    }
}
