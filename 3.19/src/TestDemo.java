public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {0,0,8,5,4};
        boolean value = isStraight(arr);
        System.out.println(value);
    }

    public static boolean isStraight(int[] nums) {
        int count = 0;
        int i = 0;
        for(int a = 0; a < nums.length; a++){
            for( int b = nums.length-1; b > a; b--) {
                if(nums[a] > nums[b]) {
                    int tmp = nums[a];
                    nums[a] = nums[b];
                    nums[b] = tmp;
                }
            }
        }
        while(i < nums.length) {
            if(nums[i] == 0) {
                count++;
            } else{
                break;
            }
            i++;
        }
        i=i+1;
        for(; i < nums.length; i++) {
            if(i > 0) {
                if(nums[i] == nums [i-1]) {
                    return false;
                }
                if((nums[i]-1) != nums[i-1]) {
                    count -= (nums[i]-nums[i-1]-1);
                    if(count >= 0) {
                        continue;
                    } else {
                        return false;
                    }
                }

            }
        }
        if(i < nums.length){
            return true;
        }
        return false;
    }
}
