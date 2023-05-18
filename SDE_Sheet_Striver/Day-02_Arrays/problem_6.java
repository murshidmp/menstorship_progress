class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long reversed = 0;
        long original = n;
        
        while ( n!=0 ){
            
            long digit = n%10;
            reversed = reversed*10 + digit;
            n/=10;
            
        }
        
        return reversed;
        
    }
}