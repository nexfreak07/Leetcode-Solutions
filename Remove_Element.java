public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int j  = 0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
