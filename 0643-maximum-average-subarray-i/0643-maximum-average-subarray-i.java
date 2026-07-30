class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
        sum+=nums[i];
        }
        int res=sum;

        int s=0;
        int e=k;
        while(e<nums.length){
            sum=sum-nums[s];
            s++;

            sum=sum+nums[e];
            e++;

            res=Math.max(res,sum);
        }
        return (double) res/k;
    }
}