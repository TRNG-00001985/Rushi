public class Lcm 
{
    public static void main(String[] args) 
    {
        int x = 30;
        int y = 40;
        int l=0;
        int big = x>y?x:y;

        for(int i =big; i<=(x*y); i++)
        {
            if(i%x==0 && i%y==0)
            {
                l = i;
                break;
            }
            //System.out.println(l);
        }
        System.out.println(l);
        
    }
    
}
