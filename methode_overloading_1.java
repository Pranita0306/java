class methode_overloading_1
{

// a> by changing the return type:
int multiply(int a, int b)
{
return a*b;
}
double multiply(double a, double b)
{
return a*b;
}

// b> by changing the number of argument passed :

int add(int a, int b, int c)
{
return a+b+c;
}
int add(int a, int b)
{
return a+b;
}

// 



public static void main(String[] args)
{
methode_overloading_1 obj = new methode_overloading_1();


int c= obj.multiply(5,4);
double d= obj.multiply(4.1, 7.6);
System.out.println("methode_overloading_1 : return int :" + c);
System.out.println("methode_overloading_1 : return double :" + d);



int x= obj.add(5,4,4);
double y= obj.add(4, 7);
System.out.println("methode_overloading_1 : 3 parameter :" + x);
System.out.println("methode_overloading_1 : 2 parameter:" + y);

}
}