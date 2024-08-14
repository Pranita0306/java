

interface In1
{
    final int a = 10;
    default void display()
    {
        System.out.println("hello");
    }
}

class interface_2 implements In1
{
    // Driver Code
    public static void main (String[] args)
    {
        interface_2  t = new interface_2 ();
        t.display();
    }
}