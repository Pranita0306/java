import java.util.Random;
import java.util.Scanner;

class game{
public int number;
public int inputnumber;

public int getnoofguesses(){
return noofguesses;
}

public void setnoofguesses(int noofguesses){
this.noofguesses = noofguesses;
}

game(){
Random rand = new Random();
this.number = rand.nrxtInt(100);
}

void takeuserinput(){
System.out.println("guess the number ");
Scanner sc= new Scanner(System.in);
inputnumber = sc.nextInt();
}

Boolean iscorrectnumber(){
noofguesses++;
if(inputnumber == number){
System.out.format(" yes you guessed it right , it was %d \n you guessed it in %d attempts" , number, noofguesses);
return true;
}

else if(inputnumber < number){
System.out.println(" too low …….");
}

else if(inputnumber > number){
System.out.println(" too hight …….");
}
return false;
}
}

public class game1{
public static void main(String[] args){


game g = new game();
Boolean b= false;
while(!b){
g.takeuserinput();
b= g.iscorrectnumber();
}
}
}
