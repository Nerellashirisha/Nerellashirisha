class hello
{
	public static void main(String args[])
	{	
		String name="siri";
		int birth_year=2000;
		int current_year=2023;
		int current_age=current_year-birth_year;
		System.out.println("your name is: "+name);
		System.out.println( "your age is: "+current_age);
		int oneyear=365;
		int totalyears=23;
		int months=12;
		int hours=24;
		int minutes=1440;
		int total_days=totalyears*oneyear;
		int total_hours=total_days*hours;
		int total_minutes=total_hours*minutes;
		int total_months=totalyears*months;
		System.out.println("days for 1 year: "+oneyear);
		System.out.println("total years are:  "+totalyears);
		System.out.println("total months are: "+total_months);
		System.out.println("total days are:  "+total_days);
		System.out.println("total hours are:  "+total_hours);
		System.out.println("total minutes are:  "+total_minutes);
	}
}
	