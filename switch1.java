class switch1
{
public static void main(String args[])
{
int a=11,b=2;
switch(1)
{
case 1:if(a%b==0)
{
System.out.println("even number");
int sum=a+b;
System.out.println("the sum is:"+sum);
}
else {

System.out.println("odd number");
int multiple=a*b;
System.out.println("the multiple is:" + multiple );
}
break;

default:System.out.println("not divisible");
}
}
}