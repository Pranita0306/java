import java.util.Scanner;

class person{
String name;
String birthdata;
double height;
double weight;
String address;

person(String name,String birthdata,double height,double weight,String address)
{
this.name=name;
this.birthdata=birthdata;
this.height=height;
this.weight=weight;
this.address=address;
}


}

class student extends person{
int roll_no;
double []mark;

student(String name,String birthdata,double height,double weight,String address,int roll_no,double []mark)
{
super(name, birthdata,height,weight,address);
this.roll_no=roll_no;
this.mark=mark;
}

}


class test{
public static void main(String[] args){

Scanner s= new Scanner(System.in);
System.out.println("enter student details :");

System.out.print("Name : ");
String name= s.nextLine();

System.out.print("birthdata : ");
String birthdat= s.nextLine();

System.out.print("height : ");
String height= s.nextDouble();

System.out.print("weight : ");
String weight= s.nextDouble();
 s.nextLine();

System.out.print("roll_no : ");
int roll_no= s.nextInt();

Student student = new Student(name, birthdat,height, weight, roll_no);
System.out.println("\n name of student :" + student.name);
}
}

