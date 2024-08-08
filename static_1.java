public class static_1{
static int num= 100;
static String str="pranita";

static void display()
{
System.out.println("static num is " + num);
System.out.println("static string is " + str);
}

void show()
{
// static method can accessed in non static
display();
}

public static void main(String args[])
{
static_1 obj = new static_1();
obj.show();
//static method can called directly without an object
display();

// static method is pass-by-reference
//instance is the pass-by value
}
}