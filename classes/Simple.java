public class Simple
{
	public static void main(String args[])
	{
		welcome w = new welcome();
		w.message(); 
	}
}

class welcome
{
	
	 void message()
	{
		String s="Welcome Aijaz";
		System.out.println(s);
	}
}