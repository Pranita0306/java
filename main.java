class IDGenerator
{

	private static int nextid = 1;
	public static int generateld()
		{
		int id = nextid;
		nextid++;
		return id;
		}
}

public class main
{
	public static void main(String[] args)
		{
			System.out.println("generated ld :" + IDGenerator.generateld());
			System.out.println("generated ld :" + IDGenerator.generateld());
			System.out.println("generated ld :" + IDGenerator.generateld());
			System.out.println("generated ld :" + IDGenerator.generateld());
		}
}
 