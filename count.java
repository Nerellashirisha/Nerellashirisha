class count
{
public static void main(String args[])
{

//FINDING FACTORS

int start=1,num=4;

while(start<=num)
{
	if(num%start==0)
	{
	System.out.println(start);
	}
start++;
}

//CALCULATING COUNT
	start=1;
	num=4;
	int count=0;
	while(start<=num)
	{
	if(num%start==0)
	{
	count++;
	}
	start++;
	}
	System.out.println("count is:"+count);
	System.out.println();
//SUPER NUMBER PROGRAM
	start=1;
	num=4;
 	count=0;
	while(start<=num)
	{
		if(num%start==0)
		{
		count++;
		}
		start++;
	}
	System.out.println("count is:"+count);
		if(count==3)
		{
		System.out.println("super number");
		}
		else
		{
		System.out.println("not a super number");
		}	

	}
}