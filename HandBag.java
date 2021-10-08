class HandBag
{
	String colour;
	float cost,size;
	String brand,material;
	int capacity;

	HandBag()
	{
		System.out.println("invoked handbag constructor");
	}
	HandBag(String brand,float size)
	{
		System.out.println("invoked handbag constructor with string and float");
		System.out.println("brand:"+brand);
		System.out.println("size:"+size);
	}
	HandBag(float cost)
	{
		System.out.println("invoked handbag constructor with float");
		System.out.println("cost:"+cost);
	}
	HandBag(String colour)
	{
		System.out.println("invoked handbag with a String");
		System.out.println("colour:"+colour);
	}
	HandBag(String brand,String material)
	{
		System.out.println("invoked handbag constructor with parameters");
		System.out.println("brand:"+brand);
		System.out.println("material:"+material);
	}
	HandBag(float size,String material)
	{
		System.out.println("invoked handbag constructor with byte");
		System.out.println("size:"+size);
		System.out.println("material:"+material);
	}
	HandBag(int capacity)
	{
		System.out.println("invoked handbag constructor");
		System.out.println("capacity:"+capacity);
	}
    HandBag(int capacity,float cost)
	{
		System.out.println("invoked handbag constructor with int and float");
		System.out.println("capacity:"+capacity);
		System.out.println("cost:"+cost);
	}
	HandBag(int capacity,String material)
	{
		System.out.println("invoked handbag constructor with int and string");
		System.out.println("capacity:"+capacity);
		System.out.println("material:"+material);
	}
	HandBag(String material,int capacity)
	{
		System.out.println("invoked handbag constructor with string and float");
		System.out.println("material:"+material);
		System.out.println("capacity:"+capacity);
	}
}
	
	