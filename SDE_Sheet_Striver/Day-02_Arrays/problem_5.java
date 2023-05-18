//User function Template for Java


class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int left = k-1;
        int right = arr.length - k;
        
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}