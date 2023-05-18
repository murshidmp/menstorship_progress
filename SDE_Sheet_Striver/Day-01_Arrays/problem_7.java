class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  
                  for (int i=0; i<n; i++){
                      
                      if (!isPaliendrome (a[i])){
                          
                          return 0;
                      }
                  }
                  
                  return 1;
           }
           
    private static boolean isPaliendrome(int num) {
        
        int reverse = 0;
        int original = num;
        
        while(num!=0){
            
            int digit = num%10;
            reverse = reverse*10 + digit;
            num /=10;
            
        }
        
        return original == reverse;
        
    }       
}