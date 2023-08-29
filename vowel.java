class vowel
{
	public static void main(String args[])
	{
		char s1='a';
		//int s1=(int)(s);
			
		if(s1>=65 && s1<=90)
                 {
			 if(s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U')
			{
				System.out.println(s1+ "is capital vowel");
			}
			else
			{
				System.out.println(s1+ " is capital consonant");
			}
		}

                 else if(s1>=97 && s1<=122) 
			{
				if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
		 		{
		 		
		 		System.out.println(s1+ "is a small vowel");
		 		}	
				else
				{
				System.out.println(s1+ " is a small consonant");

				}
			}
			  //int s2=(int)(s1);
		 	 else if(s1>=0 && s1<=9)
			{
				if(s1=='1'||s1==2||s1==3||s1==3||s1==4||s1==5||s1==6||s1==7||s1==8||s1==9)
				{
				System.out.println(s1 + "is a number");
		 		}	
				
				
			}
else
{
System.out.println(s1+ " is a symbol");		
}
}
}

				