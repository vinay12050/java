class HeadSet
{
	String colour="Red";
	boolean noiseCancellation,microphone;
	String brand,type;
	float price;

	HeadSet()
	{
		System.out.println("invoked headset constructor");
	}
	HeadSet(String brand,boolean noiseCancellation)
	{
		System.out.println("invoked headset constructor with string and float");
		System.out.println("brand:"+brand);
		System.out.println("noiseCancellation:"+noiseCancellation);
	}
	HeadSet(float price)
	{
		System.out.println("invoked headset constructor with float");
		System.out.println("price:"+price);
	}
	HeadSet(String colour)
	{
		System.out.println("invoked headset with a String");
		System.out.println("colour:"+colour);
	}
	HeadSet(String brand,String type)
	{
		System.out.println("invoked headset constructor with parameters");
		System.out.println("brand:"+brand);
		System.out.println("type:"+type);
	}
	HeadSet(boolean microphone,float price)
	{
		System.out.println("invoked headset constructor");
		System.out.println("microphone:"+microphone);
		System.out.println("price:"+price);
	}
	HeadSet(boolean noiseCancellation,String brand)
	{
		System.out.println("invoked headset constructor with boolean and string");
		System.out.println("noiseCancellation:"+noiseCancellation);
		System.out.println("brand:"+brand);
	}
	HeadSet(String type,float price)
	{
	System.out.println("invoked headset constructor with string and float");
		System.out.println("type:"+type);
		System.out.println("price:"+price);	
	}
	HeadSet(float price,String colour)
	{
		System.out.println("invoked headset constructor");
		System.out.println("price:"+price);
		System.out.println("colour:"+colour);
	}
	HeadSet(float price,boolean microphone)
	{
		System.out.println("invoked headset constructor with bollean and string");
		System.out.println("price:"+price);
		System.out.println("microphone:"+microphone);
	}
	
}
	
	