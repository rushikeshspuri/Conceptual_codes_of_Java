final class Demo 
{
    public void fun()
    {System.out.println("Inside Demo fun");}

    public void gun()
    {System.out.println("Inside Demo gun");}
    
}

class Hello extends Demo        // Error
{
    public void gun ()
    {    System.out.println("Inside Hello gun"); }
}
class Final_Class
{
    public static void main (String A[])
    {
       Demo dobj = new Demo();      // Allowed
        Hello hobj = new Hello();
   
    }
    
}
