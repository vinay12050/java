class BiCycle
{
	String colour;
	int price;
	String brand="AVON";
	BiCycleType type=BiCycleType.BMX;
	
	void brake()
	{
		System.out.println("invoked instance method brake");
	}
	
	void move()
	{
		System.out.println("invoked instance method move");
	}
	
	void displayDetails(String colour,int price,String brand)
	{
		System.out.println("invoked instance method displayDetails");
		this.colour=colour;
		this.price=price;
		this.brand=brand;
		System.out.println(colour);
		System.out.println(price);
		System.out.println(brand);
	   
	}
}
