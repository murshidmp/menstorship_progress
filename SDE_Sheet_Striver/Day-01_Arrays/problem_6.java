class GfG
{
    void printPat(int n)
    {
		for(int k=0; k<n; k++)
		{
			for(int i=n; i>0; i--)
			{
				for(int j=0; j<n-k; j++)
				{
					System.out.print(i + " ");
				}
				
			}
			System.out.print("$");
		}
         
    }
}