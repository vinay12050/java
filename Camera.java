class Camera
{
	String brand;
	float pixel;
	int price;
	String model;
	boolean resolution;
	
	Camera(String brand,float pixel,int price,String model,boolean resolution)
	{
		System.out.println("Created Camera constructor with parameters");
		this.brand=brand;
		this.pixel=pixel;
		this.price=price;
		this.model=model;
		this.resolution=resolution;
		System.out.println(this.brand);
		System.out.println(this.pixel);
		System.out.println(this.price);
		System.out.println(this.model);
		System.out.println(this.resolution);
	}
	String getBrand()
	{
		return this.brand;
	}
	float getPixel()
	{
		return this.pixel;
	}
	int getPrice(){
		return this.price;
	}
	boolean getResolution(){
		return this.resolution;
	}
	String getModel(){
		return this.model;
	}
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	void setPrice(int price){
		this.price=price;
	}
	void setPixel(float pixel){
		this.pixel=pixel;
	}
	void setModel(String model){
		this.model=model;
	}
	void setResolution(boolean resolution){
		this.resolution=resolution;
	}
}
