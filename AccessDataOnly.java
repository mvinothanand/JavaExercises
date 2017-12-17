class AccessDataOnly{
	public static void main(String[] args)
	{
		DataOnly d = new DataOnly();
		
		System.out.println(d.i++);
		System.out.println(d.i);
		System.out.println(d.f++);
		System.out.println(d.d--);
	}	
}