class primenum
{
public static void main(String args[])
{
int start=1,end=100,count=0;
while(start<=100)
{
if(end%start==0)
{
count++;
if(count==2)
{
System.out.println(start);
}
}
start++;
}
//System.out.println(count);
}
}