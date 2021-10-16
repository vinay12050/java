class ProductStarter
{
	public static void main(String[] args)
	{
		Product product=new Product();
		product.displayDetails();
		product.name="Mobile";
		product.price=15.0;
        product.quality=true;
        product.quantity=5;
        product.isiMark=true;
        product.displayDetails();

        Product product1=new Product();
        product1.displayDetails();
        product1.name="TV";
        product1.price=25.0;
        product1.quality=true;
        product1.quantity=5;
        product1.isiMark=true;
        product1.displayDetails();
		
		Product product2=new Product();
		product2.name="Laptop";
		product2.price=37.0;
        product2.quality=true;
        product2.quantity=7;
        product2.isiMark=true;
        product2.displayDetails();

        Product product3=new Product();
        product3.displayDetails();
        product3.name="Calculator";
        product3.price=450.0;
        product3.quality=true;
        product3.quantity=15;
        product3.isiMark=false;
        product3.displayDetails();
		
		Product product4=new Product();
		product4.name="Keyboard";
		product4.price=790.0;
		product4.quality=false;
		product4.quantity=9;
		product4.isiMark=true;
		product4.displayDetails();
		
		product.displayTotalPrice();
		product1.displayTotalPrice();
		product2.displayTotalPrice();
		product3.displayTotalPrice();
		product4.displayTotalPrice();
		
	}
}
