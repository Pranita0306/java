class circle{
public int radius;
circle(){
System.out.println(" I am non param of circle");
}
circle(int r){
System.out.println("I am circle parameterized constructer");
this.radius= r;
}
public double area(){
return Math.PI*this.radius*this.radius;
}
}

class cylinder1 extends circle{
public int height;
cylinder1(int r, int h){
super(r);
System.out.println("I am cylinder parameterized constructer");
this.height= h;
}
public double volume(){
return Math.PI*this.radius*this.radius*this.height;
}
}
class circle_cylinder{
public static void main(String[] args){
circle objc = new circle(12);
cylinder1 obj = new cylinder1(12, 4);

 double area = objc.area();
 System.out.println("Area of the circle: " + area);
 double volume = obj.volume();
 System.out.println("Volume of the cylinder: " + volume);


}
}