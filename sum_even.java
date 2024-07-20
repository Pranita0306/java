import java.util.Scanner;
class sum_even
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter a nun :");
int n=s.nextInt();
int sum=0;
int number=0;
int count=0;
while(count < n)
{
if(number%2 == 0)
{
sum=sum+number;
count++;
}
number++;
}
System.out.println("sum is :" + sum);
}
}
