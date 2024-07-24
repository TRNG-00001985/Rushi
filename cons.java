public class cons 
{
    int a;
    String name;

    public cons()
    {
        this.a = 100;
        this.name = "abc";
    }

    cons(String name)
    {
        this.name = name;
        //this.a = 0;

    }

    cons(String name, int a)
    {
        this.name = name;
        this.a = a;
    }

    public void display()
    {
        System.out.printf("number:" +a + " letter=" +name);
    }

    public static void main(String[] args) {
        cons obj = new cons("jiu",9);
        obj.display();
    }
    
}
