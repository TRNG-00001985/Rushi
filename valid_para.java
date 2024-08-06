import java.util.Stack;

public class valid_para{
    public static void main(String[] args) {

        String p="{{[]}}";
        
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<p.length();i++){
            
            if(p.charAt(i)=='[' || p.charAt(i)=='{' || p.charAt(i)=='(')
            {
                st.push(p.charAt(i));
            }
            else
            {
                if(p.charAt(i)=='}')
                {
                    if(st.peek()=='{')
                    {
                        st.pop();
                    }
                }
                if(p.charAt(i)==']' )
                {
                    if(st.peek()=='[')
                    {
                        st.pop();
                    }
                }
                if(p.charAt(i)==')' )
                {
                    if(st.peek()=='(')
                    {
                        st.pop();
                    }
                }
                
            }
        }
        if(st.empty())
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }

    }
}
