class WalletRunner
{
	public static void main(String[] args)
	{
		Wallet wallet=new Wallet();
		String cm=wallet.countryMade;
		System.out.println(cm);
		
		String cur=wallet.colour;
		System.out.println(cur);
		
		int pe=wallet.price;
		System.out.println(pe);
	}
}
