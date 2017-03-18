package practice;

import java.util.Scanner;

public class ClosestTo
{

	public static void main (String[] args)
	{
		
		System.out.println(closestTo(new Scanner("5 9 12 1 11 7"), 10));
	}

	private static int closestTo(Scanner s, int b)
	{
		int bestCandidate = s.nextInt();
		int bestDistance;
		int compareInt;
		if (bestCandidate == b)
		{
			return bestCandidate;
		}
		else if(bestCandidate < b)
		{
			bestDistance = Math.abs(b-bestCandidate);
		}
		else //(bestCandidate > b)
		{
			bestDistance = Math.abs(bestCandidate-b);
		}
		while(s.hasNext())
		{
			compareInt = s.nextInt();
			if (compareInt == b)
				return compareInt;
			if (compareInt < b && Math.abs(b-compareInt) <= bestDistance)
			{
				bestCandidate = compareInt;
				bestDistance = Math.abs(b-compareInt);
			}
			if (compareInt > b && Math.abs(compareInt-b) <= bestDistance)
			{
				bestCandidate = compareInt;
				bestDistance = Math.abs(compareInt-b);
			}
		}
		return bestCandidate;
	}
}
