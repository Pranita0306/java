
import java.util.Scanner;
class pyramid
{
public static void main(String[] args)
{
int n;
Scanner s= new Scanner(System.in);
System.out.println("enter a nun :");
n=s.nextInt();
for(int i=0; i<n; i++){
for(int j=n; j>i; j--)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}

