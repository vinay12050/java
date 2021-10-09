class ScooterStarter
{
	public static void main(String[] values)
	{
		Scooter scooter=new Scooter();
		
		Scooter scooter1=new Scooter("Red");
		System.out.println(scooter1.colour);
		
		Scooter scooter2=new Scooter("LED","YAMAHA");
		System.out.println(scooter2.lightsType);
		System.out.println(scooter2.brand);
		
		Scooter scooter3=new Scooter(77777,137.77f);
		System.out.println(scooter3.cost);
		System.out.println(scooter3.weight);
		
		Scooter scooter4=new Scooter(0.0f,null,0);
		System.out.println(scooter4.weight);
		System.out.println(scooter4.colour);
		System.out.println(scooter4.cost);
	}
}
