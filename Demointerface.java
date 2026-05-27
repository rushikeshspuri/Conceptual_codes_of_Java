interface Circle 
{
    // Characterstics
    float PI = 3.14f;        // public static final
}

class Demointerface 
{
    public static void main (String A[])
    {
        System.out.println(Circle.PI);
        Ciricle PI = 7.14;  // Error due to final
    }
}