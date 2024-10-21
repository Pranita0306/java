class mythread extends Thread{
@Override
public void run(){
int i=0;
while(i<40000){
System.out.println(" my cooking thread is running");
System.out.println("I am happy ! ");
i++;
}
}
}public class multithread {
public static void main(String[] args){
mythread t1 = new mythread;
t1.start();
}
}
