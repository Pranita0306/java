abstract class subject{
subject(){
System.out.println("learing subject");
}
abstract void syllabus();

void learn()
{
System.out.println("preparing right now");
}
}

class it extends subject{
void syllabus(){
System.out.println("c, java , c++");
}
}
class abstract_1{
public static void main(String [] args){
subject x =new it();
x.syllabus();
x.learn();
}
}