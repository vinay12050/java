class RockStarter
{
	public static void main(String[] values)
	{
		Rock rock=new Rock();
		System.out.println(rock.type);
		Rock rock1=new Rock(null,0.0f);
		System.out.println(rock1.origin);
		System.out.println(rock1.size);
		Rock rock2=new Rock(null);
		System.out.println(rock2.type);
		Rock rock3=new Rock(0,null,0.0f);
		System.out.println(rock3.weight);
		System.out.println(rock3.origin);
		System.out.println(rock3.size);
	}
}