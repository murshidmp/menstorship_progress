class Solution{
    static int evenlyDivides(int N){
        // code here
        int count=0;
        int original = N;
        while (N!=0){
          int digit = N%10;
          
          if ( digit!=0){
              
               if (original%digit == 0)
               
              count++;
          }
          
          N/=10;
          
        }
        
        return count++;
    }
}