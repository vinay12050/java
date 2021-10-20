class StringStarter
{
	public static void main(String[] values)
	{
		String company="X-workz";
		String trainer=new String("xyz");
		if(company==trainer){
			System.out.println("both strings are pointing to same memory");
		}
		else{
			System.out.println("both strings are not pointing to same memory location");
		}
		
		char ch=company.charAt(5);
		System.out.println(ch);
		boolean con=trainer.contains("xz");
		System.out.println(con);
		char[] countryName={'I','N','D','I','A'};
		String nameOfTheCountry=String.copyValueOf(countryName);
		System.out.println(nameOfTheCountry);
		String currency="Rupee";
		String indianCurrency="IND"+currency;
		System.out.println(indianCurrency);
		String food="Biryani";
		String chick="Chicken";
		chick=chick.concat(food);
		System.out.println(chick);
		String chickWithAmp=chick.replace('i','#');
		System.out.println(chickWithAmp);
		String brand="KOENIGSEGG";
		int length=brand.codePointAt(6);
		System.out.println(length);
		int length2=brand.codePointBefore(4);
		System.out.println(length2);
		String name1="Columbus";
		String name2="BONAPARTE";
		int boat=name2.compareToIgnoreCase(name1);
		System.out.println(boat);
		String country="INDIA";
		CharSequence country1="India";
		boolean value=country.contentEquals(country1);
		System.out.println(value);
		String country2="India";
		boolean value2=country2.equalsIgnoreCase(country);
		System.out.println(value2);
		String institute="X-workz ODC";
		boolean value3=institute.endsWith("v");
		System.out.println(value3);
		String name3="TATA NEXON";
		System.out.println("Returning words:");
		String[] str=name3.split("X",0);
		for(String v:str){
		System.out.println(v);
		}
		String st=new String("String subsequence method");
		System.out.println(st.subSequence(3,23));
		String sg1=new String("Invoking the method regionMatches");
		String sg2=new String("Invoking");
		System.out.println(sg1.regionMatches(9,sg2,7,19));
		String tagline="Live Young,LiveFree";
		System.out.println("String length is:");
		System.out.println(tagline.length());
		String sg3=" FORD ";
		System.out.println(sg3+"ECOSPORT");
		System.out.println(sg3.trim()+"ECOSPORT");
		String s="toCharArray Method";
		char[] ch3=s.toCharArray();
		int leng=ch3.length;
		System.out.println("Char Array length:"+leng);
		System.out.println("Char Array elements:");
		for(int i=0;i<leng;i++){
			System.out.println(ch3[i]);
		}
		String string=new String("SailBoat");
		System.out.println(string);
		char chars[]={'T','U','R','B','I','N','E'};
		String s7=new String(chars);
		System.out.println(s7);
		byte by[]={77,87,97,107};
		String s9=new String(by);
		System.out.println(s9);
		String s11=new String(by,1,2);
		System.out.println(s11);
		char chars2[]={'s','t','a','n','d','a','r','d'};
		String s15=new String(chars2,0,5);
		System.out.println(s15);
		String bs=new String();
		System.out.println("Length:"+bs.length());
		char charArray[]={'X','-','w','o','r','k','z','.','i','n'};
		String ca=new String(charArray);
		System.out.println(ca);
		int[] code={71, 101, 101, 107, 115};
        String s8=new String(code, 1, 3);
		System.out.println(s8);
		char ar[]={'M','o','u','n','t','a','i','n'};
        String vs=new String(ar,0, 5);
		System.out.println(vs);
	}
}