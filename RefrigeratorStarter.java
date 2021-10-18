class RefrigeratorStarter
{
	public static void main(String[] values)
	{
		Refrigerator refrigerator=new Refrigerator(null,270,"LG",true);
		int capacity=refrigerator.getCapacity();
		boolean doubleDoor=refrigerator.getDoubleDoor();
		if(capacity>0)
		{
			System.out.println(capacity);
		}
		if(doubleDoor==true)
		{
			System.out.println(doubleDoor);
		}
		refrigerator.setModel(null);
		refrigerator.setCapacity(330);
		refrigerator.setCompany("Whirlpool");
		refrigerator.setDoubleDoor(false);
		System.out.println(refrigerator.getCapacity());
		System.out.println(refrigerator.getDoubleDoor());
		System.out.println(refrigerator.getCompany());
		System.out.println(refrigerator.getModel());
	}
}
		