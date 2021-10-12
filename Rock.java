class Rock
{
	String type="Sedimentary Rocks";
	float size;
	String origin;
	int weight;
	
	Rock()
	{
		System.out.println("invoked no-arg constructor of rock");
	}
	
	Rock(String origin,float size)
	{
		System.out.println("invoked string & float constructor of rock");
		this.size=size;
		this.origin=origin;
	}
	Rock(String type)
	{
		System.out.println("invoked string constructor of rock");
		this.type=type;
	}
	Rock(int weight,String origin,float size)
	{
		System.out.println("invoked int,string & float constructor of rock");
		this.weight=weight;
		this.origin=origin;
		this.size=size;
	}
}