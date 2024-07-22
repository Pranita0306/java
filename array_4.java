class array_4
{
public static void main(String[] args)
{
int []arr={1,2,3,4,5,6};

Boolean isSort= true;
for(int i=0; i<arr.length-1; i++){
if(arr[i]>arr[i+1]){
isSort= false;
break;
}
}
if(isSort){
System.out.print("the array is sort");
}
else{
System.out.print("the array is not sort");
}
}
}