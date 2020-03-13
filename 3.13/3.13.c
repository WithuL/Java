//数组中出现次数超过一半的数

int majorityElement(int* nums, int numsSize){
    for(int i = 0; i < numsSize; i++) {
        for(int j = i+1; j<numsSize; j++) {
            if(nums[i] > nums[j]) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }
    return nums[(numsSize/2)];
}