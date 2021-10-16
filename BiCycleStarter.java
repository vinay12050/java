class BiCycleStarter
{
	public static void main(String[] args)
	{
		BiCycle biCycle=new BiCycle();
		biCycle.brake();
		biCycle.move();
		biCycle.displayDetails("RED",0,null);
		BiCycleType type=BiCycleType.BMX;
	    System.out.println(type);
	}
}