 class logicalexample2
{
	public static void main(String args[])
	{
	 int hardness=60;
	double carbon=0.5;
	int tensile_strength=6000;
	int grade;
	if(hardness==70 && carbon<0.7)
	{
	 if(tensile_strength>5600)
	{
		grade=10;
	}
	else 
	{
		grade=5;
	}
	}
	else
	{
 	if(hardness==80 && carbon<0.7)
	{
		grade=9;
	}
	else if(carbon>0.7 && tensile_strength>5600)
	{
		grade=8;
	}
	else if(hardness==90 && tensile_strength>5600)
	{
		grade=7;
	}
	else if(hardness==50 || carbon>0.7)
	{
		grade=6;
	}

	else 
	{
		grade=5;
	}
}
	System.out.println("hardness is:"+hardness);
	System.out.println("carbon for the steel is:"+carbon);
	System.out.println("tensile strength of the steel under consideration is:"+tensile_strength);
	System.out.println("grade of the steel is:" +grade);
}
}
