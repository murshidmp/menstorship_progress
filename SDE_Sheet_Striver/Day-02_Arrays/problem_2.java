class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum = 0;
        int original = n;
        while (n!=0){
            
            int digit = n%10;
            sum+=Math.pow(digit,3);
            n/=10;
        }
        if (original==sum){
            
            return "Yes";
        }else {
            return "No";
        }
    }
}