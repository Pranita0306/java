

class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{ 
			System.out.println("Thread A : " +i);
		}
		
		try 
			{
			Thread.sleep(1000);
			}

		catch(InterruptedException e)
			{
			System.out.println(e);
			}
     }
}

class B extends Thread
{
	public void run()
		{
		for(int i=1; i<=5; i++)
		{ 
			System.out.println("Thread B : " +i);
		}
		
		try 
			{
			Thread.sleep(1000);
			}

		catch(InterruptedException e)
			{
			System.out.println(e);
			}
     }
}

class Exp_10
{
	public static void main(String[] args)
	{
          Thread threadA = new A();
		Thread threadB = new B();
		threadA.start();
		threadB.start();
}
}