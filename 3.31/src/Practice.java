public class Practice {
}
//移动0
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] == 0 ) {
                int j = i+1;
                while( j < nums.length -1 && nums[j] == 0 ) {
                    j = j+1;
                }
                if(j == nums.length ) {
                    return;
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}
//爬楼梯
class Solution1 {
    public int climbStairs(int n) {
        int old = 1;
        int prev = 2;
        int last = 0;
        if(n == 1) {
            return old;
        }else if (n == 2 ) {
            return prev;
        }else{
            for(int i = 3; i <= n; i++) {
                last = old + prev;
                old = prev;
                prev = last;
            }
            return last;
        }
    }
}
