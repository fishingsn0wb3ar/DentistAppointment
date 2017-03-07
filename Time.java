public class Time
{
	public static void main(String[] args)
	{
		getTime Time1 = new getTime();
		Time1.getHours(Integer.parseInt(args[0]));
		Time1.getMinutes(Integer.parseInt(args[1]));
		Time1.addMinutes(Integer.parseInt(args[2]));
		System.out.print(Time1.display());
	}
}