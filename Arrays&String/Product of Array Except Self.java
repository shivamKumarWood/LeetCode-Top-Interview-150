class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n]; left[0]=nums[0];
        int right[]=new int[n]; right[n-1]=nums[n-1];
        int prod[]=new int[n];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i];
            right[n-i-1]=right[n-i]*nums[n-i-1];
        }
        prod[0]=right[1];
        prod[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            prod[i]=left[i-1]*right[i+1];
        }
        return prod;
    }
}