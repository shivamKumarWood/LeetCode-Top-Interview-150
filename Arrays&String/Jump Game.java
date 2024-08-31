class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int steps=nums[0];
        if(steps==0) return false;
        for(int i=1;i<nums.length-1;i++){
            steps--;
            if(steps>=nums.length-i-1) return true;
            steps=Math.max(steps,nums[i]);
            if(steps==0){
                return false;
            }
        }
        return true;
    }
}