class array_2
{
public static void main(String[] args)
{
float []arr={10.1f, 4.2f, 4.0f, 4.9f, 9.2f};
float num=10.1f;
Boolean isInArray= false;
for(float element:arr){
if(num== element){
isInArray= true;
break;
}
}
if(isInArray){
System.out.print("the ele is present in the array");
}
else{
System.out.print("the ele is not present in the array");
}
}
}