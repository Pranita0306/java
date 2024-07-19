import java.util.Scanner;

class pass
{
public static void main(String[] args)
{
byte m1,m2,m3;
Scanner s = new Scanner(System.in);
System.out.print("mark for m1 :");
m1=s.nextByte();
System.out.print("mark for m2 :");
m2=s.nextByte();
System.out.print("mark for m3 :");
m3=s.nextByte();
float avg =(m1+m2+m3)/3.0f;
System.out.println("avg is :" + avg);
if(avg<=40 && m1<=30 && m2<=30 && m3<=30)
{
System.out.println("pass");
}
else
{
System.out.println("not pass");
}

}
}


