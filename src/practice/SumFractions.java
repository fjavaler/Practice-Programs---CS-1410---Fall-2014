package practice;

public class SumFractions
{

	public static void main(String[] args)
	{
		System.out.println(sumFractions(2, 4));

	}

	private static double sumFractions(double n, double m)
	{
		double sum=0;
		for (int i = 0; n+i <= m; i++)
		{
			sum = sum + 1/(n+i);
		}
		return sum;
	}
}
