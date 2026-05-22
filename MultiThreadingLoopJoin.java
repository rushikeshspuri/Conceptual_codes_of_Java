class Demo extends Thread
{
    public void run ()
    {
        int i = 0;

        for (i=1 ; i<=100; i++)
        {
            System.out.println("Inside run Method of : "+Thread.currentThread().getName()+" : " +i);
        }
        
    }
}
class MultiThreadingLoopJoin 
{
    public static void main (String A[])throws Exception
        {
            System.out.println("Main thread is Running");

            Demo dobj1 = new Demo();
            Demo dobj2 = new Demo();

            dobj1.setName("First");
            dobj2.setName("Second");
            
            dobj1.start();
            dobj2.start();

                        dobj1.join();
            dobj2.join();

            System.out.println("End of main  thread");  
        }
    
}