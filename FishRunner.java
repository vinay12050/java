class FishRunner
{
	
	public static void main(String[] values)
	{
		Fish fish=new Fish();
		fish.name="Hag Fish";
		String nm=fish.name;
		fish.colour="Grey";
		String cr=fish.colour;
		fish.kingdom="Animalia";
		String kd=fish.kingdom;
		String gr=fish.group;
		float wt=fish.weight;
		
		System.out.println(gr);
		System.out.println(nm);
		System.out.println(cr);
		System.out.println(wt);
		System.out.println(kd);
	}
	
}
