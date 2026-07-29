class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pfp[]=new int[nums.length];
        int sfp[]=new int[nums.length];
        int ans[]=new int[nums.length];
        pfp[0]=1;
        for(int i=1;i<nums.length;i++){
            pfp[i]=pfp[i-1]*nums[i-1];
        }
        sfp[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sfp[i]=sfp[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pfp[i]*sfp[i];
        }
        return ans;
    }
}