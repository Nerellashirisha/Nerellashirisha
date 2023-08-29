class shopping
{
	public static void main(String args[])
	{
		String item="jeens top";
		String color="meroon";
		int quantity=1;
		int actual_price=142;
		double off=6;
		char size1='m',size2='s',size3='l';
		double discount=6.0/100*(actual_price);
		double maxprice=actual_price-discount;
		String address="h-no:2-27,ccpally";
		String mode_of_payment="online";
		double coupon=5.0/100*maxprice;
		double total_price=maxprice-coupon;
		System.out.println("selected item is : "+item);
		System.out.println("item color is: "+color);
		System.out.println("selected size is :"+size1);
		System.out.println("item original cost is:"+actual_price);
		System.out.println("your discount is: "+discount);
		System.out.println("maximum price is : "+maxprice);
		System.out.println("payment mode is:"+mode_of_payment);
		System.out.println("coupon amount is:"+coupon);
		System.out.println("total amount is ="+total_price);
	}
}