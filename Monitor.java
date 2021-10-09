class Monitor
{
	String colour="Black";
	int price;
	String brand,type;
	float size;
	
	Monitor()
	{
		System.out.println("invoked monitor constructor.");
		System.out.println(this);
	}
	Monitor(String colour)
	{
		System.out.println("invoked monitor");
		this.colour=colour;
	}
	Monitor(String type, float size,String brand)
	{
		System.out.println("invoked monitor parameterized constructor");
        this.type=type;
		this.size=size;
		this.brand=brand;
	}
	Monitor(int price,String type)
	{
		System.out.println("invoked monitor constructor with int and String");
		this.price=price;
		this.type=type;
	}
	Monitor(float size,String colour,int price)
	{
		System.out.println("invoked monitor constructor with float");
		this.size=size;
		this.colour=colour;
		this.price=price;
	}
}
 