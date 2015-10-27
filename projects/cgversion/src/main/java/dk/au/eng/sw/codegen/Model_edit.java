package dk.au.eng.sw.codegen;

import org.overture.codegen.runtime.*;

import java.util.*;

//Special edit of the code generated main model class.
//This is the same as the normal CG class. It just calls the edited bridge.
//For demo purposes, a main method has also been added.

@SuppressWarnings("all")
public class Model_edit
{
	public Model_edit()
	{
	}

	public Number add(final Number a, final Number b)
	{
		return bridge_Tool_edit.add(a, b);
	}

	public String toString()
	{
		return "Model{}";
	}

	public static void main(String[] args)
	{
		System.out.println(new Model_edit().add(1, 2));
	}
}
