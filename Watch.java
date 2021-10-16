class Watch
{
	String countryMade;
	WatchType watchType=WatchType.ANALOG;
	
		void displayDetails(String countryMade)
	{
		System.out.println("invoked instance method displayDetails");
		this.countryMade=countryMade;
		System.out.println(countryMade);
		
	}
}
