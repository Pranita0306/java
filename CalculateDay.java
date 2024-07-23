public class CalculateDay
{
	public static void main(String args[])
	{
		int date=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		int daypassed=date;
		String days[]={"Sunday","monday","Tue","Wed","Thur","Fri","Sat"};
		int dayofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<month;i++)
		{
			daypassed = daypassed+dayofmonth[i];
		}
		System.out.println(daypassed);
		
		if(year%4==0 && month>2)
		{
			daypassed=daypassed+1;
		}
		
		int leap=0;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=1;
				}
			}
			else
			{
				leap=1;
			}
		}
		
		if(leap==1)
		{
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
}