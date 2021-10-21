class Wrapper
{
	public static void main(String[] values)
	{
		byte x=7;
		byte y=77;
        int value=Byte.compare(x,y);
        if(value==0){
        System.out.println("The values of x and y are equal");
		}
        else if(value>0){
        System.out.println("x is greater than y");
		}
        else{
        System.out.println("y is greater than x");
		}		
		Byte ve=53;
		Byte be=9;
		Double d=be.doubleValue();
		Double db=ve.doubleValue();
		System.out.println("The double value of byte ve is:"+db);
		System.out.println("The double value of byte ve is:"+d);
		Byte by=117;
		Float ft= by.floatValue();
		System.out.println("The float value of by is:"+ft);
		String sg="-77";
		Byte val=Byte.parseByte(sg);
		System.out.println(val);
		byte bite=-99;
		Long vlue=Byte.toUnsignedLong(bite);
		System.out.println("The Unsigned Long value of bite is:"+bite);
		String srg="120";
		Byte vale=Byte.valueOf(srg);
		System.out.println("The byte value of srg is:"+vale);
		boolean valuee=be.equals(ve);
		if(valuee){
			System.out.println(ve + "and" +be+ "are equal.");
		}
		else{
		System.out.println(ve+ "and" +be+ "are not equal.");
	    }
	    Byte z=69;
		int va=z.intValue();
		System.out.println("The integer value of z is:"+va);
		Byte v=34;
		byte s=v.byteValue();
		System.out.println("The byte value of Byte v is:"+s);
		
		Byte b1=99;
		Short sht=b1.shortValue();
		System.out.println("The short value of b1 is:"+sht);
		Short sh=88;
		byte bb=sh.byteValue();
		System.out.println("The byte value of short sh is:"+bb);
		Short s1=13799,s2=15872,s3=29894;
		int cv=Short.compare(s1,s2);
		System.out.println(cv);
		int result=s2.compareTo(s3);
		System.out.println(result);
		Short sv=1799;
		double dv=sv.doubleValue();
		System.out.println(dv);
		boolean rust=s3.equals(s2);
		System.out.println(rust);
		String t="999";
		short tv=Short.parseShort(t);
		System.out.println(tv);
		short bc=Short.valueOf("7999");
		System.out.println(bc);
		short num=30;
		short pc=Short.reverseBytes(num);
		System.out.println(pc);
		Short av=312;
		long ppc=av.longValue();
		System.out.println(ppc);
		
		int n=75;
		System.out.println(Integer.toBinaryString(n));  
        System.out.println(Integer.bitCount(n)); 
		Integer nu=37;
		byte byt=nu.byteValue();
		System.out.println(byt);
		int numb1=53,numb2=88;
		System.out.println(Integer.compare(numb1, numb2));
        Integer i1=876,i2=98,i3=876;		
		System.out.println(i1.compareTo(i2));
		boolean bln=i1.equals(i3);
		System.out.println(bln);
		int bv=Integer.highestOneBit(n);
		System.out.println("The highest one bit of integer is:"+bv);
		int bp=Integer.lowestOneBit(n);
		System.out.println("The lowest one bit of integer is:"+bp);
		int vs=457;
		System.out.println(Integer.toBinaryString(vs));
		System.out.println(Integer.numberOfLeadingZeros(vs));
		System.out.println(Integer.numberOfTrailingZeros(vs));
		int nmbr=907;
		int vp=Integer.reverse(nmbr);
		System.out.println(vp);
		
		Long zs=65l;
		int ev=Long.bitCount(zs);
		System.out.println(ev);
		Long iv=567l;
		int dist=7;
		Long rus=Long.rotateLeft(iv,dist);
		System.out.println(rus);
		Long rus2=Long.rotateRight(96l,3);
		System.out.println(rus2);
		Long ln=-3725l;
		int lv=Long.signum(ln);
		System.out.println(lv);
		Long lvs=Long.reverse(iv);
		System.out.println(lvs);
		Long lp=37l;
		String stg=Long.toHexString(lp);
		System.out.println(stg);
		String stg2=Long.toOctalString(lp);
		System.out.println(stg2);
		String stg3=Long.toBinaryString(lp);
		System.out.println(stg3);
		String stg4=lp.toString();
		System.out.println(stg4);
		Long obs=Long.reverseBytes(zs);
		System.out.println(obs);
		
		Float f1=7.2f,f2=3f;
		float cy=f1.floatValue();
		System.out.println(cy);
		int sd=Float.floatToIntBits(f1);
		System.out.println(sd);
		int sd2=Float.floatToRawIntBits(f1);
		System.out.println(sd2);
		int vt=98;
		float sd3=Float.intBitsToFloat(vt);
		System.out.println(sd3);
		int com=f1.compareTo(f2);
		if(com>0){
			System.out.println("value is greater than zero");
		}
		else{
			System.out.println("value is not greater than zero");
		}
		int comp=Float.compare(f1,f2);
		if(comp>0){
			System.out.println("f1 is greater than f2");
		}
		else{
			System.out.println("f1 is not greater than f2");
		}
		float f3=6787.432765f,f4=48654683;
		boolean bvp=Float.isInfinite(f3);
		System.out.println(bvp);
		boolean bvp2=Float.isNaN(f3);
		System.out.println(bvp2);
		String sg1=Float.toHexString(f3);
		System.out.println(sg1);
		float nb=Float.valueOf(f4);
		System.out.println(nb);
		
		Double a=17.87557347,b=987.234;
		double asd=Double.sum(a,b);
		System.out.println(asd);
		double asd1=Double.max(a,b);
		System.out.println(asd1);
		double asd2=Double.min(a,b);
		System.out.println(asd2);
		int v2=76317127;
		Double asd3=Double.longBitsToDouble(v2);
		System.out.println("Value after conversion:"+asd3);
		int compa=a.compareTo(b);
		if(compa>0){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("b is not greater than a");
		}
		int compa2=Double.compare(a,b);
		if(compa2<0){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("b is not greater than a");
		}
		boolean bln2=Double.isFinite(a);
		System.out.println(bln2);
		boolean bln3=a.isNaN();
		System.out.println(bln3);
		boolean bln4=Double.isInfinite(b);
		System.out.println(bln4);
		long lng=Double.doubleToRawLongBits(b);
		System.out.println(lng);
		String strg="56.34";
		double db9=Double.parseDouble("56.34");
		System.out.println(db9);
        Double obj1=5.7;  
        System.out.println( "Result after being converted to double value = "+obj1.doubleValue()*4);
		
	    int a1=579,a2=1546719;
		int rs=Character.charCount(a1);
		System.out.println(rs);
		String str="Mahindra Thar";
        int rs2=str.codePointAt(4);
        System.out.println(rs2);		
		char[] cp=new char[]{ 'h', 'e', 'l', 'l', 'o' };  
        int ind=2,limit=4,indc=3;
        int rs3=Character.codePointAt(cp,ind);
        System.out.println(rs3);
		int rs4=Character.codePointAt(cp,indc,limit);
		System.out.println(rs4);
		char[] ca=new char[]{'T','h','a','r'};
		int rs5=Character.codePointBefore(ca,ind);
		System.out.println(rs5);
		char rs6=Character.highSurrogate(a1);
		System.out.println(rs6);
		char rs7=Character.lowSurrogate(a2);
		System.out.println(rs7);
		CharSequence seq="Thar";
		int offset=2,count=3;
		int rs8=Character.codePointCount(seq,offset,count);
		System.out.println(rs8);
		char ca1='V';
		boolean rs9=Character.isLowerCase(ca1);
		System.out.println(rs9);
		boolean rs10=Character.isUpperCase(ca1);
		System.out.println(rs10);
		
		String sn="true";    
        boolean boon=Boolean.parseBoolean(sn); 
		System.out.println(boon);
		Boolean bin=true;
		Boolean bin2=false;
		Boolean bin3=true;
		Boolean bin4=false;
		boolean boon1=Boolean.valueOf(bin);
		System.out.println(boon1);
		String sng=Boolean.toString(bin);
		System.out.println(sng);
		if(bin.equals(bin2)){
			System.out.println("returns true");
		}
		else{
			System.out.println("returns false");
		}
		boolean boon3=Boolean.logicalAnd(bin,bin2);
		System.out.println(boon3);
		boolean boon4=Boolean.logicalOr(bin2,bin4);
		System.out.println(boon4);
		boolean boon5=Boolean.logicalXor(bin,bin4);
		System.out.println(boon5);
		boolean boon6=Boolean.logicalAnd(bin,bin3);
		System.out.println(boon6);
		int boon7=bin.hashCode();
		System.out.println(boon7);
		int boon8=Boolean.compare(bin,bin2);
		if(boon8==0){
			System.out.println("Equal");
		}
		else{
			System.out.println("Unequal");
		}
		int boon9=bin.compareTo(bin3);
		System.out.println(boon9);
		
			
	}
}
 