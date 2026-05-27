class Demo extends Thread
{
    public void run ()
    {
        System.out.println("Inside run");
    }
}

class ThreadScenario1X
{
    public static void main (String A[])
        {
            System.out.println("Main thread is Running");

            Demo dobj = new Demo();

            Thread tobj = new Thread(dobj);

            tobj.start();
        }
    
}