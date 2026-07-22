class Solution {
    public int hammingWeight(int n) {
        String b=Integer.toBinaryString(n);
        char[] arr = b.toCharArray();
        int res=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == '1'){
                res++;
            }
        }
        return res;
    }
}