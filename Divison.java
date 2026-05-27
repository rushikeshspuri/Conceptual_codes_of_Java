import java.util.*;
class Divison 
{
    public static void main(String A[]) 
    {
        Scanner Sobj = new Scanner(System.in);
        float No1 = 0.0f , No2 = 0.0f ,  Ans = 0.0f;

        System.out.println("Enter Your number :");
        No1 = Sobj.nextFloat();

        System.out.println("Enter Your number :");
        No2 = Sobj.nextFloat();

       Ans = No1 / No2;

       System.out.println("Division is :" +Ans);
    }
}
