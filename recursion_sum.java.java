import java.util.Scanner;
class recursion_sum
{

static int sum(int n)
{

if(n==1)
{
return 1;
}
else
{
return n+ sum(n-1);
}
}

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int x = s.nextInt();
System.out.println(" sum of the no in which :" + x);
   s.close(); 
System.out.println("sum is =" +sum(x));
}
}
