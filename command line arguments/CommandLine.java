class CommandLine
{
	public static void main(String args[])
	{
		int count,i=0;
		count = args.length;
		System.out.println("Number of arguments = "+ count);
		while(i<count)
		{
			
			System.out.println(args[i]);
			i = i+1;
		}
	}
}