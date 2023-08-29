class employee
{
	public static void main(String args[])
{
String name="siri";
int basicsalary=25000,year=12;
double pf,tax,grosssalary,grosssalary_year;
double ta=15.0/100*basicsalary;
double hra=19.0/100*basicsalary;
double da=12.0/100*basicsalary;
double totalsalary=basicsalary+ta+da+hra;
if(basicsalary>40000)
{
pf=11.0/100*basicsalary;
tax=5.0/100*basicsalary;
}
else
{
pf=7.0/100*basicsalary;
tax=2.5/100*basicsalary;
}
grosssalary=totalsalary-pf-tax;
grosssalary_year=grosssalary*year;
System.out.println("1 year salary is:"+grosssalary_year);
}
}
