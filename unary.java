class unary
{
public static void main(String args[])
{

  	// UNARY INCREMENT OPERATORS

int a=10;
System.out.println(a++ + a++ + a++);//a=10//a=a+1=11+10=21//12+21=33
System.out.println(a);
a=10;
int b=19;
System.out.println(++a);
System.out.println(b++);
System.out.println(b);
a=2;
b=3;
System.out.println(a++);
System.out.println(a);
System.out.println(++b);
a=11;
b=a;
System.out.println(a++ + ++a);
System.out.println(b++ + b++ + b);
a=11;
b=a++;
System.out.println(a);
System.out.println(b);
a=11;
b=15;
System.out.println(a++ + ++a + --b);


		//UNARY DECREMENT OPERATORS
 a=11;
b=10;
System.out.println(a++ + --a + b++ + --b);
System.out.println(b++ + b-- + ++a + --a + a++);
}
}