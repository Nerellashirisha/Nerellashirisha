class employee
{
	public static void main(String args[])
	{
		int eid=123;
		String ename="siri";
		String eaddress="hyd";
		double e_workingdays=30;
		double e_absentdays=5;
		double e_daywisesalary=700;
		int payedleaves=3;
		double e_totalworkdays=e_workingdays-e_absentdays;
		double e_salary=e_daywisesalary*e_workingdays;
		double e_totalsalary=e_daywisesalary*(e_totalworkdays+payedleaves);
		System.out.println("employee name is:"+ename);
		System.out.println("employee address is:"+eaddress);
		System.out.println("employee working days is:"+e_workingdays);
		System.out.println("employee daywisesalary  is:"+e_daywisesalary);
		System.out.println("employee employee total worked days are:"+e_totalworkdays);
		System.out.println("employee month salary  is:"+e_salary);
		System.out.println("employee salary for worked days is:"+e_totalsalary);
	}
}



