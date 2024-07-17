import java.util.Scanner;
class kilometer
{
public static void main (String[] args)
{

Scanner s= new Scanner(System.in);
System.out.println("enter a you value :");
double kilometer = s.nextDouble();
double m=kilometer /1.6;
System.out.print("after converting the : " + m +"meter");

s.close();
}
}


