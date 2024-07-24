public class isSorted 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,35,4,5,6};
        int s = arr.length;
        boolean iss = true;

        if(s==0 || s ==1)
        {
            System.out.println("True");
        }

        for(int i=0;i<s-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                iss=false;
                break;
            }
        }

        if(iss)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

       
        
    }
    
}
