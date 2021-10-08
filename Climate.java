class Climate
{
	String type;
	float temperature;
	int humidity;
	String location="Karnataka";
	String description;
	
	Climate()
	{
		System.out.println("invoked climate constructor");
	}
	Climate(float temperature)
	{
		System.out.println("invoked climate constructor with float");
		System.out.println("temperature:"+temperature);
	}
	Climate(String type)
	{
		System.out.println("invoked climate constructor with string");
		System.out.println("type:"+type);
	}
	Climate(String description,String location)
	{
		System.out.println("invoked climate constructor with parmeters");
		System.out.println("description:"+description);
		System.out.println("location:"+location);
	}
	Climate(int humidity,float temperature)
	{
		System.out.println("invoked climate constructor with float parmeters");
		System.out.println("humidity:"+humidity);
		System.out.println("temperature:"+temperature);
	}
	Climate(int humidity,String type)
	{
		System.out.println("invoked climate constructor");
		System.out.println("humidity:"+humidity);
		System.out.println("type:"+type);
	}
	Climate(String location,int humidity)
	{
		System.out.println("invoked climate constructor");
		System.out.println("location:"+location);
		System.out.println("humidity:"+humidity);
	}
	Climate(String description,float temperature)
	{
		System.out.println("invoked climate constructor..");
		System.out.println("description:"+description);
		System.out.println("temperature:"+temperature);
	}
	
}
