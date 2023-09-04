class prime
{
public static void main(String args[])
{
int num=10, end=1,count=0;
	while(num>=end)
{	
	if(num%end==0)
{
	count++;
}
end++;
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