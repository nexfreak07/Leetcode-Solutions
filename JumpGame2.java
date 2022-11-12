public class JumpGame2 {
    public int jump(int[] nums) {
        int jump = 0;
        int maxReach = 0;
        int pos = 0;
        for(int i=0; i<nums.length-1;i++)
        {
            maxReach = Math.max(maxReach, i+nums[i]);
            if(pos==i)
            {
                pos = maxReach;
                jump++;
            }
        }
        return jump;
    }
}
