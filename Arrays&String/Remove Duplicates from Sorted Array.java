class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0,p2=1,k=1;
        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                nums[k]=nums[p2];
                p1=p2;k++;
            }
            p2++;
        }
        return k;
    }
}
