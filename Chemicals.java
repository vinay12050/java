class Chemicals
{
	public static String clean(String[] chemicalName)
	{
		System.out.println("invoked clean");
		for(int i=0;i<chemicalName.length;i++)
		{
			String names=chemicalName[i];
			System.out.println(names);
		}
		return "names";
	}
}

			