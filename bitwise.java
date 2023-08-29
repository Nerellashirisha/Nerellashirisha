class bitwise
{
public static void main(String args[])
{
		//USING BITWISE OPERATORS

int a=12,b=17,c=15;
if(a>=b & a>=c)
{
System.out.println("a is greater");
}else if(b>=a & b>=c)
{
System.out.println("b is greater");
}
else{
System.out.println("c is greater");
}
		//SWAPPING

a=a^b;
b=a^b;
a=a^b;
System.out.println(a);
System.out.println(b);

//AND OR EX-OR
System.out.println(a&b);//01100&10001==>00000
System.out.println(a^b);//01100^10001==>11101
System.out.println(a|b);//01100|10001==>11101
System.out.println(~b);//01100==>10011==>//19//-18
int n1=15,n2=16;
System.out.println(n1&n2);
System.out.println(n1|n2);
System.out.println(n1^n2);
}
}
