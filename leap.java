public class leap 
{
    public static void main(String[] args) 
    {
    int y=2012;

    if(y%4==0)
	{
		if(y%100!=0 || y%400==0) 
        {
            System.out.println("Leap year");
                

        }
	}
    else
    {
        System.out.println("Not leap year");
    }
        
    }
}
