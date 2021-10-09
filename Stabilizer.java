class Stabilizer
{
	String colour="Red";
	int cost;
	String type,application;
	float warranty;
	
	Stabilizer()
	{
		System.out.println("invoked stabilizer constructor.");
		System.out.println(this);
	}
	Stabilizer(String colour)
	{
		System.out.println("invoked stabilizer");
		this.colour=colour;
	}
	Stabilizer(String type, float warranty,int cost)
	{
		System.out.println("invoked stabilizer parameterized constructor");
        this.type=type;
		this.warranty=warranty;
		this.cost=cost;
	}
	Stabilizer(String application,String type)
	{
		this.application=application;
		this.type=type;
	}
	Stabilizer(float warranty)
	{
		System.out.println("invoked stabilizer constructor with float");
		this.warranty=warranty;
	}
}
 