class StabilizerStarter
{
	public static void main(String[] values)
	{
		Stabilizer stabilizer=new Stabilizer();
		
		Stabilizer stabilizerxyz=new Stabilizer("Grey");
		System.out.println(stabilizerxyz.colour);
		
		Stabilizer stabilizer1=new Stabilizer("Static",2.5f,4500);
		System.out.println(stabilizer1.type);
		System.out.println(stabilizer1.warranty);
		System.out.println(stabilizer1.cost);
		
		Stabilizer stabilizer2=new Stabilizer(null,null);
		System.out.println(stabilizer2.application);
		System.out.println(stabilizer2.type);
		
		Stabilizer stabilizer3=new Stabilizer(0.0f);
		System.out.println(stabilizer3.warranty);
	}
	
} 