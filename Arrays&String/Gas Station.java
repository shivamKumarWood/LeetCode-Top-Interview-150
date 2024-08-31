class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int fuel=0,begin=0;
        int req=0;
        for(int i=0;i<n;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                begin=i+1;
                req+=fuel;
                fuel=0;
            }
        }
        if(fuel+req>=0) return begin;
        return -1;
    }
}