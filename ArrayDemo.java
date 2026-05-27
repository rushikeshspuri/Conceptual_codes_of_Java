class ArrayDemo 
{
    public static void main (String A[])
    {
        int Arr [] = {10,20,30,40};         // 1st way

        int [] Brr  = {10,20,30,40};        // 2nd way

        int Crr [] = new int [4];           // 3rd way

        Crr [0] = 10;
        Crr [1] = 20;
        Crr [2] = 30;
        Crr [3] = 40;

        System.out.println(Arr.length);
        System.out.println(Brr.length);
        System.out.println(Crr.length);
    }
}
