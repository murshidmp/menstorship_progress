// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {

        // code here

        int sum = 0;

        while (N != 0) {

            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        if (is_palindrome(sum)) {

            return 1;
        } else {

            return 0;
        }

    }

    public boolean is_palindrome(int n) {
        // Code
        int reversed = 0;
        int original = n;
        while (n != 0) {

            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed == original;
    }
}