package practice;

public class Counter
{
	private int counter;
	private int limit;

	public Counter(int i, int j)
	{
		counter = i;
		limit = j;
	}
	
	public void increment()
	{
		if(counter<limit)
			counter++;
	}
	
	public void decrement()
	{
		if(counter>0)
			counter--;
	}
	
	public int getValue()
	{
		return counter;
	}
}