class logicalexample
{
	public static void main(String args[])
	{
		String name="raju";
		String health="excellent";
		int age=30;
		String live="city";
		char gender='m';
		int policy_amount=200000;
		int premium_per_thousand=4;	
		policy_amount=policy_amount/1000;
		if(health=="excellent" &&  address=="city")
		{	
		   if(gender=='m' && (age>=25 && age<=35))	
		{
	           int premium=premium_per_thousand*policy_amount;
		 System.out.println("calculated premium is:"+premium);
		
		}
		}
		else
		{
			System.out.println("no");
		}


 		name="siri";
		health="excellent";
		age=28;
		live="city";
		gender='f';
		premium_per_thousand=3;
		policy_amount=100000;
		policy_amount=policy_amount/1000;
		
		if(health=="excellent" &&  address=="city")
		{
		if(gender=='f' && (age>=25 && age<=35))					
		{
		int premium=premium_per_thousand*policy_amount;
		 System.out.println("calculated premium is:"+premium);
		}
		}
		else
		{
			System.out.println("no");
		}

		
		name="madhu";
		age=33;
		gender='m';
		health="poor";
		live="village";
		premium_per_thousand=6;
		policy_amount=10000;
		policy_amount=policy_amount/1000;
		
		if(health=="poor" &&  address=="village")
		{
			if(gender=='m' && (age>=25 && age<=35))					
			{
				int premium=premium_per_thousand*policy_amount;
		 		System.out.println("calculated premium is:"+premium);
			}
		}
		else
		{
			System.out.println("no");
		}

}

}

		