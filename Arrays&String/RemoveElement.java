class Solution {
    public int removeElement(int[] nums, int val) {
        int p1=0,p2=0,k=0;
        while(p2!=nums.length){
            if(nums[p2]!=val){
                k++;
                nums[p1]=nums[p2];
                p1++;
            }
            p2++;
        }
        return k;
    }
}