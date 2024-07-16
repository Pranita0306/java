import java.util.Scanner;
class mark
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
float[] mark= new float[5];
float totalmark=0.0f;
for(int i=0; i<5; i++)
{
System.out.println("enter the mark of"+ (i+1) +"subject:");
mark[i]=scanner.nextFloat();
totalmark+=mark[i];


}
float per=(totalmark/500)*100;
System.out.println("per"+ per +"%");
scanner.close();
}
} 
