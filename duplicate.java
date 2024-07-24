import java.util.HashSet;

public class duplicate 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,3,4,4,5};

        int s = arr.length;
        
        if(s==0 || s==1)
        {
            System.out.println("no duplicates");
        }

        else {
            HashSet<Integer> seen = new HashSet<>();
            boolean foundDuplicate = false;

            for (int num : arr) 
            {
                if (seen.contains(num)) 
                {
                    foundDuplicate = true;
                    break;
                }
                seen.add(num);
            }

            if (foundDuplicate) 
            {
                System.out.println("True");
            } 
            
            else 
            {
                System.out.println("No duplicates");
            }
        
        }
    
}
}
