class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,ans=0;
        while(left<right){
            int area=(right-left)*Math.min(height[left],height[right]);
            ans=Math.max(ans,area);
            if(height[left]<height[right]) left++;
            else if(height[left]>height[right]) right--;
            else{
                left++;right--;
            }
        }
       
        return ans;
        
    }
}