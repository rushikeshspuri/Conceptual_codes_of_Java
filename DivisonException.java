import java.util.*;
class DivisonException
{
    public static void main(String A[]) 
    {
        Scanner Sobj = new Scanner(System.in);
        int No1 = 0 , No2 = 0 ,  Ans = 0;

        System.out.println("Enter Your number :");
        No1 = Sobj.nextInt();

        System.out.println("Enter Your number :");
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

        System.out.println("Division is :" +Ans);
    }
}
