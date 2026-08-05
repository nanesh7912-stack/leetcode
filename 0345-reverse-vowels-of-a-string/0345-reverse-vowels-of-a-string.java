class Solution 
{
    public String reverseVowels(String s) 
    {
        char[] a=s.toCharArray();
        int l=0;
        int r=a.length-1;

        while(l<r)
        {
            while(l<r && "AEIOUaeiou".indexOf(a[l]) == -1)
            l++;

            while(l<r && "AEIOUaeiou".indexOf(a[r]) == -1)
            r--;

            char temp =a[l];
            a[l]=a[r];
            a[r]=temp;

            l++;
            r--;
        }
        return new String(a);
    }
}