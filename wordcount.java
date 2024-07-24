public class wordcount 
{
    public static void main(String[] args) 
    {
        String i = "uyexg";

        int ca = cc(i);

        System.out.println(ca);

        
        
    }

    public static int cc(String str)
    {
        if(str==null || str.isEmpty())
        {
            return 0;
        }

        int count = 0;
        for(char c : str.toCharArray())
        {
            count++;
        }
        
        return count;
    }
    
}
