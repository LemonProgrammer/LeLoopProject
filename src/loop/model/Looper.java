package loop.model;

import java.util.ArrayList;

public class Looper
{
	private ArrayList<String> graveNameList;

	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}

	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
		
	}
	
	private void fillTheNameList()
	{
		graveNameList.add("Amorillis C. Vincent");
		graveNameList.add("Joe M.");
		graveNameList.add("Ingrid L. Lindell");
		graveNameList.add("Josephine A. Orton");
		graveNameList.add("Carl Erick");
		graveNameList.add("Anna Lovisa Karlson");
		graveNameList.add("James A. Lipsey");
		
		
	}

	public String loopTest1()
	{
		String loopResult = "";
		int timesLooped = 0;
		for (int loopCounter = 0; loopCounter <= 10; loopCounter++)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}

		loopResult += "\nThe loop executed" + timesLooped + "times\n";

		return loopResult;
	}

	public String loopTest2()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{

					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += outerLoopTimes + "" + loopCounter +
						// ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times\n";

		return loopResult;
	}
	
	public String loopTest3()
	{
		String loopResult = "";
		int timesLooped = 0;
		for (int dozen = 10; dozen < 100; dozen++)
		{
			for (int donuts = 0; donuts < 1; donuts++)
			{
				timesLooped++;
			}
		}
		
		loopResult += "\nThe loop did this many times: " + timesLooped;
		
		return loopResult;
		
	}

}
