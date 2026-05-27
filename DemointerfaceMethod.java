interface Circle 
{
    // Characterstics  (public static final)
    float PI = 3.14f;        

    // Behaviours (public abstract)
    float Area(float Radius);
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    // Error due to missing body of area and circumference of above 2 methods
}

class DemointerfaceMethod 
{
    public static void main (String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}