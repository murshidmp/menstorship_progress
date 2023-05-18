class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        
        
        int median;
        int length = v.length;
        
        if (length % 2 == 0){
            
            median = (v[length/2]+v[(length/2)-1])/2;
        }else{
            
            median = v[(length-1)/2];
        }
        
        return median;
    }
}