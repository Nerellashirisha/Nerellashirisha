class logicalexample4
{
	public static void main(String args[])
	{
		char s1='a';
		//int s1=(int)(s);
		 if(s1>=65 && s1<=90)
                 {
			 if(s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U')
			{
				System.out.println(s1+ "is vowel");
			}
			else
			{
				System.out.println(s1+ " is consonant");
			}
		}

                 else if(s1>=97 && s1<=122) 
			{
				if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
		 		{
		 		
		 		System.out.println(s1+ "is vowel");
		 		}	
				else
				{
				System.out.println(s1+ " is consonant");
				}
			}
		}
		
}

				