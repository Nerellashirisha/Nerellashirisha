class primeforward
{
	public static void main(String agrs[])
	{
		int start=1,end=7,count=0;
		while(start<=end)
		{
			if(end%start==0)
			{	
			count++;
			}
		start++;
		}
		System.out.println("total count is:"+count);
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