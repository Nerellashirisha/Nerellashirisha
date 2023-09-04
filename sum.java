class sum
{
public static void main(String args[])
{
int end=1,start=10,var=0;
while(start>=end)
{
var+=start;
start--;
}
System.out.println("backward sum is:"+var);
 end=10;
start=1;
var=0;
while(start<=end)
{
var+=start;
start++;
}
System.out.println("forward sum is:"+var);

}
}