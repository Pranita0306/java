class array_3
{
public static void main(String[] args)
{
float [] mark={4.5f, 2.1f,5.9f,8.2f, 6.7f};
float sum=0;
for(float element: mark)
{
sum+=element;
}
System.out.print("total is:" + sum/mark.length);
}
}