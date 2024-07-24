public class sumDigits 
{
    public static void main(String[] args) {
        
        int quo =0;
        int n = 12324;
        int rem =0;

        while(n>0)
        {
            quo = n%10;
            rem = rem+quo;
            n=n/10;
        }
        System.out.println(rem);
    }
    
}
