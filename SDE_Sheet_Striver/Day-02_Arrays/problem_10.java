class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        
        Arrays.sort(a);
        
        long [] result = new long[(int)n-2];
        
        for (int i=0; i<n-2; i++){
            
            result[i]=a[i];
        }
        
        return result;
    }
}