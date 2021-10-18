class CameraStarter
{
	public static void main(String[] args)
	{
		Camera camera=new Camera("Nikon",24.3f,99,"Z5",true);
		String brand=camera.getBrand();
		float pixel=camera.getPixel();
		int price=camera.getPrice();
		if(brand!=null)
		{
			System.out.println(brand);
		}
		if(pixel>0.0f)
		{
			System.out.println(pixel);
		}
		camera.setBrand("Canon");
		camera.setPrice(119);
		camera.setPixel(0.0f);
		camera.setModel(null);
		camera.setResolution(false);
		System.out.println(camera.getBrand());
		System.out.println(camera.getModel());
		System.out.println(camera.getResolution());
		System.out.println(camera.getPixel());
		System.out.println(camera.getPrice());
	}
}
		