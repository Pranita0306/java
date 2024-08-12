import java.util.Scanner;

interface client
{
void input();
void output();
}

class abc implements client
{
String name;
String add;
double sal;

public void input()
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a name");
name = sc.nextLine();

System.out.println("Enter a add");
add = sc.nextLine();

System.out.println("Enter a sal");
sal = sc.nextDouble();

}

public void output()
{
System.out.println("name :"  + name);
System.out.println("add :"  + add);
System.out.println("sal :"  + sal);
}
}

class interface_test{
public static void main(String args[]){
client c = new abc();
c.input();
c.output();
}
} 
