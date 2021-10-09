class MonitorStarter
{
	public static void main(String[] values)
	{
		Monitor monitor=new Monitor();
		
		Monitor monitor1=new Monitor(null);
		System.out.println(monitor1.colour);
		
		Monitor monitor2=new Monitor("Gaming",0f,"Acer");
		System.out.println(monitor2.type);
		System.out.println(monitor2.size);
		System.out.println(monitor2.brand);
		
		Monitor monitor3=new Monitor(12999,null);
		System.out.println(monitor3.price);
		System.out.println(monitor3.type);
		
		Monitor monitor4=new Monitor(34,null,0);
		System.out.println(monitor4.size);
		System.out.println(monitor4.colour);
		System.out.println(monitor4.price);
	}
}
