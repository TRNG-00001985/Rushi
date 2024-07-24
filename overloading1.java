public class overloading1 
{

    public void show(int a)
    {
        System.out.println("1");
    }
    public void show(int r,int s)
    {
        System.out.println("2");
    }

    public static void main(String[] args) 
    {
        overloading1 ol = new overloading1();

        ol.show(4);
        
    }
    
}
