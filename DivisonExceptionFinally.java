import java.util.*;
class DivisonExceptionFinally
{
    public static void main(String A[]) 
    {
        Scanner Sobj = new Scanner(System.in);
        int No1 = 0 , No2 = 0 ,  Ans = 0;

        System.out.println("Enter First number :");
        No1 = Sobj.nextInt();

        System.out.println("Enter Second number :");
        No2 = Sobj.nextInt();

       try
       {
            System.out.println("Inside try block");
            Ans = No1 / No2;             //Exception prone code
       }

       catch(ArithmeticException aobj)
       {
            System.out.println("Inside catch block");
            System.out.println("Exception Occured :"+aobj);
       }

       catch(Exception eobj)
       {
            System.out.println("Inside generic catch :"+eobj);
       }

       finally
       {
        System.out.println("Inside finally block");
        Sobj = null;        //Resource Reallocation
       }
        System.out.println("Division is :" +Ans);
    }
}
