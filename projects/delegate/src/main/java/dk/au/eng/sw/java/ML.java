package dk.au.eng.sw.java;

import dk.au.sweng.cge.MainLogic;

public class ML
{

	public static Number add(Number x, Number y)
	{
		return new MainLogic().add(x.longValue(), y.longValue());
	}

}
