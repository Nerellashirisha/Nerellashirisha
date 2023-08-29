class color
{
public static void main(String args[])
{
char c='A';
switch(c)
{
case 'A':System.out.println("capital vowel");
		break;
case 'E':System.out.println("capital vowel");
	break;
case 'I':System.out.println("capital vowel");
	break;
case 'O':System.out.println("capital vowel");
	break;
case 'U':System.out.println("capital vowel");
	break;
default :System.out.println("consonant");
}
int x=1,sum=0,multiple=1;
switch(1)
{
case 1:
while(x<=50)
{
if(x%2==0)
{
sum=sum+x;
System.out.println("the sum is:"+sum);
}
else
{
multiple=multiple*x;
System.out.println("the multiple is:"+multiple);
}
x++;
}
break;
default:System.out.println(x);
}
}
}
	
	
	