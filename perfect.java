class perfect
{
public static void main(String args[])
{
int num=3,start=1,sum=0;
while(start<num)
{
if(num%start==0)
{
sum=sum+start;
}
start++;
}
if(sum==num)
{
System.out.println("perfect number");
}
else
{
System.out.println("not a perfect number");
}
}
}