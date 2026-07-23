class Solution {
    public int maxProfit(int[] prices) {
        int cp=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            else{
                int a=prices[i]-cp;
                res=Math.max(a,res);
            }
        }
        return res;
    }
}