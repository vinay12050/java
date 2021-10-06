class ChargerRunner
{
	public static void main(String[] values)
	{
		Charger charger=new Charger();
		
		String cl=charger.colour;
		
		charger.brand="Samsung";
		String br=charger.brand;
		
		charger.cost=550;
		short ct=charger.cost;
		
		charger.capacity=18;
		byte cp=charger.capacity;
		
		String ty=charger.type;
		
		System.out.println(cl);
		System.out.println(br);
		System.out.println(ct);
		System.out.println(cp);
		System.out.println(ty);
	}
}
