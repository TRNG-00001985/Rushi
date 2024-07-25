public class arraysub 
{
    public static void main(String[] args) 
    {
		int arr[]= {1,5,3,7,9,4};
		int n = arr.length;
		for(int i=0;i<n;i++) 
        {
			
			for(int j=0;j<n;j++) 
            {
				
				for(int k=i;k<=j;k++) 
                {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
    
}
