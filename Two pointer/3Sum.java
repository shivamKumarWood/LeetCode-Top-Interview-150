class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> res=new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
            if(nums[i]+nums[j]+nums[k]==0){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                res.add(temp);
                j++;
            }
            else if(nums[i]+nums[j]+nums[k]<0) j++;
            else k--;
        }
        }
        return new ArrayList<>(res);
        
    }
}