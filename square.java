import java.util.Scanner;
class square
{
Scanner s;
int side;

public square()
{
s= new Scanner(System.in);
System.out.println("enter the side : ");
side = s.nextInt();
}
public int area()
{
return side*side;
}
public int parimeter()
{
return side*4;
}

public static void main(String[] args)
{
square obj = new square();
System.out.println("area of the square is : " +obj.area());
System.out.println("perimeter of the square is : " +obj.parimeter());
}
}



