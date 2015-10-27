package dk.au.eng.sw.codegen;

import org.overture.codegen.runtime.*;

import dk.au.eng.sw.java.ML;

import java.util.*;

// Special edit of the code generated bride class.
// This demonstrates how the "is not yet specified" statements get
// transformed into delegate calls

@SuppressWarnings("all")
public class bridge_Tool_edit {
    public bridge_Tool_edit() {
    }

// Transformed delegate call
    public static Number add(final Number a, final Number b) {
    	return dk.au.eng.sw.java.ML.add(a, b);
    }

    public String toString() {
        return "bridge_Tool{}";
    }
}
