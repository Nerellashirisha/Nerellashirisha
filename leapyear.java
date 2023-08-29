class leapyear
{
public static void main(String args[])
{
	//	LEAP YEAR OR NOT

int year=2008;
	if(year%400==0 ||(year%4==0 && year%100!=0))
	{
		System.out.println(year + "leap year");
	}
	else
	{
		System.out.println(year + " not a leap year");
}

		// MAX OF THREE NUMBERS

int a=10,b=20,c=30;
if(a>=b && a>=c)
{
	System.out.println("a is greater");
}
else if(b>=a && b>=c)
{
System.out.println(" b is greater");
}
else
{
System.out.println("c is greater");
}


			// NO .OF .DAYS OF A MONTH

int month=2;
int days;
if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
{
days=31;
System.out.println("tha no.of days of the month is:" +days);
}
else if(month==4||month==6||month==9||month==11)
{
days=30;
System.out.println("tha no.of days of the month is:" +days);
}
else
{
days=28;
System.out.println("tha no.of days of the month is:"+days);
}
}
}

