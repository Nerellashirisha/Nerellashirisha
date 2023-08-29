class phone
{
	public static void main(String args[])
	{
		String name="APPLEi[hone 14(Blue,128 GB)";
		int price=79900;
		double off=14;
		double cost=off/100*price;
 		int packagefee=99;
		double total_price=price-cost+packagefee;
		double bankoffer=5.0/100*(total_price);
		double total_cost=total_price-bankoffer;
		int supercoinsfor100=2;
		double supercoinsfor583=2*(583.7);
		int exchange=7000;
		double total_price1=total_cost-exchange; 
		System.out.println(total_price);
		System.out.println("discount is="+cost);
		System.out.println("bankoffers 5% cashback on flipkart="+bankoffer);
		System.out.println(" maximum price is="+total_cost);
		System.out.println("total super coins are="+supercoinsfor583);
		System.out.println(total_price1);
		System.out.println("total price is="+(total_price1-supercoinsfor583));



}
} 	