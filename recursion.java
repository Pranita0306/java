import java.util.Scanner;
class recursion{

static int factorial(int n)
{
if(n==0 || n==1)
{
return 1;}
else{
return n* factorial(n-1);
}
}


static int factorial_iteractive(int n)
{
if(n==0 || n==1)
{
return 1;
}
else{
int product =1;
for (int i=1; i<=n; i++)
{
product *=i;
}
return product;
}
}

public static void main(String args[])
{

Scanner s= new Scanner(System.in);
int x;
x = s.nextInt();
System.out.println("the value  x is:" + x);

System.out.println("the value of factorial x is:" + factorial(x));
System.out.println("the value of factorial x is:" + factorial_iteractive(x));

}
}



