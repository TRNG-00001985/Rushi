public class overriding1 extends one
{

    void demo(String a)
    {
        System.out.println("mu");
    }
    
    public static void main(String[] args) 
    {
        
        overriding1 or = new overriding1();
        or.demo("rf");

        one o = new one();
        o.demo("gtr");
    }
    
}
class one{
    void demo(String a){
        System.out.println("ac");
    }
}
