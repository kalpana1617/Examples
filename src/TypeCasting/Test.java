package TypeCasting;

class Test 
{	public static void main(String[] args)
	{	
		//implicit type conversion(Low to high)
		int x = 'a';			
		System.out.println(x);

		double d = 10;			
		System.out.println(d);

		//Explicit type conversion(high to low)
		int a = 131;
		byte b = (byte)a;
		System.out.println(b);

		int n = 129;
		byte bn = (byte)n;
		System.out.println(bn);

		double num = 8334943946.56;
		float f = (float)num;
		System.out.println(f);
	}
}
