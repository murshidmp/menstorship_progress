class Solution
{
    public String is_palindrome(int n)
    {
        // Code 
        int reversed = 0;
        int original = n;
         while (n!=0){
             
             int digit = n%10;
             reversed = reversed*10 + digit;
             n/=10;
         }
         
         if (original == reversed){
             
             return "Yes";
         }else{
             
             return "No";
         }
    }
}