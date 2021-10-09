class Scooter
{
	String colour="Red";
	int cost;
	String lightsType,brand;
	float weight;
	
	Scooter()
	{
		System.out.println("invoked scooter constructor.");
		System.out.println(this);
	}
	Scooter(String colour)
	{
		System.out.println("invoked scooter");
		this.colour=colour;
	}
	Scooter(String lightsType,String brand)
	{
		System.out.println("invoked scooter parameterized constructor");
        this.lightsType=lightsType;
		this.brand=brand;
	}
	Scooter(int cost,float weight)
	{
		System.out.println("invoked scooter constructor with int and String");
		this.cost=cost;
		this.weight=weight;
	}
	Scooter(float weight,String brand,int cost)
	{
		System.out.println("invoked scooter constructor with float");
		this.weight=weight;
		this.brand=brand;
		this.cost=cost;
	}
}
 