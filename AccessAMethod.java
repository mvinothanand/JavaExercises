//Accessing a method
class AccessAMethod{
	public static void main(String[] args)
	{
		//System.out.println(MethodDefn.storage("Vinoth"));
		MethodDefn a = new MethodDefn();
		System.out.println(a.storage("Vinoth"));
	}
}	

class MethodDefn{
	//static int storage(String s)
	int storage(String s)
	{
		return s.length()*2;
	}
	
}