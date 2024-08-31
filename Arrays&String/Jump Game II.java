class Solution {
    public int jump(int[] nums) {
       
        int n=nums.length;
       if(n==1)
       return 0;
       int count=0;
       int jump=0;
       int max=0;
        
        for(int i=0;i<n-1;i++)
        {
           max=Math.max(max,i+nums[i]);
           if(count==i)
           {
               count=max;
               jump++;
           }
            if(count>=n-1)
            return jump;
        }
        return jump;
        
    }
}