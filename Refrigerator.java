class Refrigerator
{
	String model,company;
	int capacity;
	boolean doubleDoor;
	
	Refrigerator(String model,int capacity,String company,boolean doubleDoor)
	{
		System.out.println("Created refrigerator constructor with parameters");
		this.model=model;
		this.capacity=capacity;
		this.company=company;
		this.doubleDoor=doubleDoor;
		System.out.println(this.model);
		System.out.println(this.capacity);
		System.out.println(this.company);
		System.out.println(this.doubleDoor);
	}
	String getModel(){
		return this.model;
	}
	int getCapacity(){
		return this.capacity;
	}
	String getCompany(){
		return this.company;
	}
	boolean getDoubleDoor(){
		return this.doubleDoor;
	}
	void setModel(String model){
		this.model=model;
	}
	void setCapacity(int capacity){
		this.capacity=capacity;
	}
	void setCompany(String company){
		this.company=company;
	}
	void setDoubleDoor(boolean doubleDoor){
		this.doubleDoor=doubleDoor;
	}
}