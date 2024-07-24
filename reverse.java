public class reverse 
{
    public static void main(String[] args) 
    {
        String s = "ckjebiegfeuy";

        String rev = fs(s);

        System.out.println(rev);

        
    }

    public static String fs(String str)
    {
        if(str.length() == 0)
        {
            return str;
        }

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while(left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);


    }
    
}
