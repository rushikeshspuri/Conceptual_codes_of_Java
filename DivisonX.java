import java.util.*;
class DivisonX
{
    public static void main(String A[]) 
    {
        Scanner Sobj = new Scanner(System.in);
        int No1 = 0 , No2 = 0 ,  Ans = 0;

        System.out.println("Enter Your number :");
        No1 = Sobj.nextInt();

        System.out.println("Enter Your number :");
        No2 = Sobj.nextInt();

       Ans = No1 / No2;

       System.out.println("Division is :" +Ans);
    }
}
