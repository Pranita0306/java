class mobile
{
static String name;
 String brand;
 int price;

void input()
{

System.out.println(" name of moblie " );
System.out.println(" name of brand " );
System.out.println(" name of price " );
}

void display()
{
this.name = "phone";
System.out.println("name is "  + name);

this.brand= "moto";
System.out.println("brand is " +brand);
}

public static void main(String[] args)
{
mobile m1 = new mobile();
m1.name="smartphone";
m1.brand="mi";
m1.price=15000;
System.out.println("brand is "+m1.name);
System.out.println("brand is "+m1.brand );


m1.display();

}
}