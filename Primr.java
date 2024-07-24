public class Primr 
{
    public static void main(String args[])
{
	int n=9;
	if(n==1)
	{
		System.out.println("this is a composite number");
	}
	else
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
	if(c==2)
	{
		System.out.println("this is a prime number");
	}else
	{
		System.out.println("this is not a prime number");
	}


    }
    
}
}
