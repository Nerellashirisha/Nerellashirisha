class student
{
	public static void main(String args[])
	{
		String name="siri",grade;
		int s1=34,s2=56,s3=68,s4=70,s5=98,s6=50;
		int total=s1+s2+s3+s4+s5+s6;
		int scholarship=0,donation=0;
		char section='A';
		double percentage=total/600.0*100;
		double fee=74000;
		if(percentage>80)
		{
			section='A';
			scholarship=10000;
			donation=0;
			grade="DISTINCTION";
		}
		else
		{
			section='B';
			scholarship=0;
			donation=15000;
			grade="fail";
		}
	fee=fee+donation-scholarship;
	System.out.println("total fee is:"+fee +" section is:"+section);
}
}
		
