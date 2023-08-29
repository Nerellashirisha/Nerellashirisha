class logical
{
	public static void main(String args[])
	{
		//LOGICAL  AND & OR OPERATORS PROGRAM
			int a=10,b=9;
			if(a<5 && ++b==10)
			{
			System.out.println(b +"yes");
			}
			else
			{
			System.out.println(b+"no");
			}
			if(a<5 || ++b==10)
			{
			System.out.println(b +"yes");
			}
			else
			{
			System.out.println(b +"no");
			}

//DIGITS FINDING PROGRAM

int num=78;
if(num>=0 && num<=9)
{
	System.out.println("single digit");
}
else if(num>=10 && num<=99)
{
	System.out.println("two digit");
}
else if(num>=100 && num<=999)
{
	System.out.println("three digit");
}
			//AGE FINDING PROGRAM
			
			int age=34;
			if(age>=0  && age<=18)
			{
				System.out.println("she/he is minor");
			}
			else if(age>=18  && age<=50)
			{
				System.out.println("she/he is major");
			}
			else if(age>=50  && age<=100)
			{
				System.out.println("she/he is senior citizen");
			}
			else 
			{
				System.out.println("please choose correct age"); 
			}

//PERCENTAGE GRADE FINDING
int per=80;
if(per>=75 && per<=100)
{
	System.out.println("FIRST CLASS WITH DISTINCTION");
}
else if(per>=65 && per<75)
{
	System.out.println("FIRST CLASS");
}
else if(per>=50 && per<65)
{
	System.out.println("SECOND CLASS");
}
else
{
	System.out.println("FAIL");
}
	
			//TERNARY OPERATOR
			int n=10;
			System.out.println(n>=0?(n>0?("positive"):("negative")):("zero"));
			System.out.println(n%2==0?(n +"is divisible"):(n+" is not divisible"));
			System.out.println(n%2==0?(n + "is even number"):(n+ " odd number"));
			

	}
}
