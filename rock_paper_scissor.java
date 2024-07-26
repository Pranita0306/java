import java.util.Random;
import java.util.Scanner;

class rock_paper_scissor
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter 0 for rock , 1 for paper, 2 for scissor  : ");
int user = s.nextInt();

Random r = new Random();
int computer = r.nextInt(3);

if(user == computer){
System.out.println("Draw");
}
else if(user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1)
{
System.out.println("you are winnnnn !!!!");
}
else 
{
System.out.println("comuter are winnnnn !!!!");
}

if(computer == 0){
System.out.println("computer choice : Rock");
}
else if(computer == 1){
System.out.println("computer choice : Paper");
}
if(computer == 2){
System.out.println("computer choice : scissor");
}
}
}
