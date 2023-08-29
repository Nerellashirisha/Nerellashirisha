class nested
{
public static void main(String args[])
{
if(false)
{
if(false)
{
System.out.println("im in inner if");
}
else
{
System.out.println("im in outer if");
}
}
else
{
if(true)
{
System.out.println("im in else-if part");
}
else
{
System.out.println("im in else-else part");
}
}
}
}