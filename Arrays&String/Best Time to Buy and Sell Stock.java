class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int val:prices){
            min=Math.min(min,val);
            res=Math.max(res,val-min);
        }
        return res;
    }
}