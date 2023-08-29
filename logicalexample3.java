class logicalexample3
{
	public static void main(String args[])
	{
	int fine_per_5days=50;
	int fine6to10_days=1;
	int fine_above10days=5;
	int bookreturned_after=30;
	int books=25;
	if(bookreturned_after==30 && books>=25)
	{
	  if(books<10)
	{
		System.out.println("pay fine for book is:"+fine_above10days);
	} 
	else if(books>=6 && books==25)
	{
		System.out.println("pay fine for book is:" +fine6to10_days);
	}
	else
	{
		System.out.println("fine for book late returned:"+fine_per_5days);
	}
}
	else

	{
		System.out.println("your membership will be cancelled");
	}
}
}

	