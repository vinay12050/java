class TrainRunner
{
	public static void main(String[] args)
	{
		Train train=new Train();
		
		String clr=train.colour;
		
		train.engineType="Diesel";
		String et=train.engineType;
		
		train.coaches=27;
		byte ch=train.coaches;
		
		short tn=train.trainNumber;
		
		train.trainName="Rajdhani Express";
		String tnm=train.trainName;
		
		System.out.println(clr);
		System.out.println(et);
		System.out.println(ch);
		System.out.println(tn);
		System.out.println(tnm);
	}
	
}
