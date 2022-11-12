public class JumpGame2 {
   /* Either you run a loop till N-1, because when it comes to end of the array
the i is equal to currentReach, and hence whatever the maxReach is found fom last index
will be updated and jump++ will be done which is not really required  */
    public int jump(int[] nums) {
        int currentReach = 0; // Variable to store reach after a jump
        int maxReach = 0; // Variable Stores maximum reach if any, towards left of currentReach
        int jump = 0;

        for(int i=0; i<nums.length-1; i++) //Loop To Explore Maximum Reach till Curret Reach
        {
            maxReach = Math.max(maxReach, i+nums[i]); //Finding Maximum Reaching Element till current Reach
            if(currentReach==i) //Loop Reached till currentReach
            {
                currentReach = maxReach; // Taking Maximum Jump, which is found till currentReach
                jump++; //Counting Jump
            }
        }
        return jump;
        
    }
}
