class primebackward
{
public static void main(String args[])
{
int start=1, num=11,count=0,num2=num;
	while(start<=num2)
{	
	if(num%num2==0)
{
	count++;
}
num2--;

}
System.out.println(count);
if(count==2)
{
System.out.println("prime number");
}
else
{
System.out.println("not a prime number");
}

}
}