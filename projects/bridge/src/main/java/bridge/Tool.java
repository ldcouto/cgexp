package bridge;

import org.overture.interpreter.runtime.ValueException;
import org.overture.interpreter.values.IntegerValue;
import org.overture.interpreter.values.Value;

import dk.au.sweng.cge.MainLogic;

public class Tool
{
	private static MainLogic ml = new MainLogic();

	public static Value add(Value x, Value y) throws ValueException
	{
		long jX = unpack(x);
		long jY = unpack(y);

		long r = ml.add(jX, jY);

		return pack(r);
	}

	private static Value pack(long r)
	{
		return new IntegerValue(r);
	}

	private static long unpack(Value x) throws ValueException
	{
		return x.intValue(null);
	}

}
