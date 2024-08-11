abstract class shape{
String col;
abstract public double area();
abstract public String to_string();

public shape( String col)
{
System.out.println("this is shape constructer ");
this.col = col;
}
    public String getcolor() { return col; }
}

class circle extends shape
{
int radius;
public circle( int radius , String col)
{
super(col);
System.out.println("this is circle constructer ");
this.radius = radius;
}
@Override public double area()
{
return Math.PI * Math.pow(radius, 2);
}
@Override public String to_string()
{
return "area of the circle is" + area() +"and col is " + getcolor() ;
}

} 

class abstract_test{
 public static void main(String args[])
{
      shape s1 = new circle(2, "RED");
       System.out.println(s1.to_string());
}
}



