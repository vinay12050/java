class ComputerStarter
{
	public static void main(String[] args)
	{
		Computer computer=new Computer();
		computer.displayDetails();
		Computer computer1=new Computer();
		computer1.brand="ACER";
		computer1.price=77.0;
		computer1.quantity=2;
		computer1.modelNo="348 G4";
		computer1.displayDetails();
		new Computer(null,0.0);
		new Computer("579 G8");
		new Computer(7,"HP",99.0);
		ComputerType computerType=ComputerType.SUPERCOMPUTER;
		System.out.println(computerType);
		computer1.displayTotalPrice();
		Computer computer2=new Computer();
		computer2.brand="DELL";
		computer2.price=57.0;
		computer2.quantity=7;
		computer2.modelNo="777 G9";
		computer2.displayDetails();
		Computer computer3=new Computer();
		computer3.brand="Apple";
		computer3.price=107.0;
		computer3.quantity=9;
		computer3.modelNo=null;
		computer3.displayDetails();
		computer2.displayTotalPrice();
		computer3.displayTotalPrice();
		computer3.displayTotalOfAll();
	}
}
