class initial
{
public static void main(String args[])
{
int x=4,count=0,initial=1;
while(initial<=x)//1<=4//2<=4//3<=4//4<=4//5<=4
{
if(x%initial!=0)//4%1!=0//4%2!=0//4%3!=0//4%4!=0
{
count++;//1
}
initial++;//2//3//4//5
}
System.out.println(count);//output=1
System.out.println(initial);//output=5
}
}
