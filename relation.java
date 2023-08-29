class relation
{
	public static void main(String args[])
	{
		int a=999,b=1000;
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
System.out.println(a==b);
System.out.println(a==999);
boolean b1=true;
if(true)
{
System.out.println("good morning");
}
int i=10,j=2;
if(i%j==0)
{
System.out.println("i is divisible by j");
}
else
{
System.out.println("not divisible");
}
int x=10,y=2;
System.out.println(x +" "+ y);
if(x%y==0)
{
x=x+y;
y=x-y;
x=x-y;
}
System.out.println(x +" "+ y);
}
}