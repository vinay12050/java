class Computer
{
	String brand;
	String modelNo;
	int quantity;
	double price;
	static double totalOfAll;
	Computer()
	{
		System.out.println("invoked computer constructor");
	}
	void displayDetails()
	{
		System.out.println("invoked display details");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.quantity);
		System.out.println(this.price);
	}
	Computer(String brand,double price)
	{
        System.out.println("invoked computer constructor with string and double");
        this.brand=brand;
        this.price=price;	
        System.out.println(this.brand);
        System.out.println(this.price);		
	}
	Computer(String modelNo)
	{
		System.out.println("invoked computer constructor with string");
		this.modelNo=modelNo;
		System.out.println(this.modelNo);
	}
	Computer(int quantity,String brand,double price)
	{
		System.out.println("invoked computer constructor with int,string & double");
		this.quantity=quantity;
		this.brand=brand;
		this.price=price;
		System.out.println(this.quantity);
		System.out.println(this.brand);
		System.out.println(this.price);
	}
	void displayTotalPrice()
	{
		System.out.println("invoked display total price");
		double totalPrice=this.quantity*this.price;
		System.out.println(totalPrice);
	}
	void displayTotalOfAll()
	{
		System.out.println("invoked display total of all");
		double totalPrice=this.quantity*this.price;
		Computer.totalOfAll=Computer.totalOfAll+totalPrice;
		System.out.println(Computer.totalOfAll);
	}
}
	