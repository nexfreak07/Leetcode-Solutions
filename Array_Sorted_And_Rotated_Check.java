public class Array_Sorted_And_Rotated_Check {
    public boolean check(int[] nums) {
        int count = 1;
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i-1]< nums[i])
            {
                continue;
            }
            else if(nums[i-1] > nums[i] && count> 0)
            {
                count --;
            }
            else if(nums[i-1] > nums[i] && count <= 0)
                return false;
        }
        if (nums[0] < nums[nums.length-1] && count<= 0)
            return false;
        return true;
    }
}
