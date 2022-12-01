package org.task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D9Q0123A {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		System.out.println("HashMap: "+m);
		
		Set<Integer> ks = m.keySet();
		System.out.println("\nTo get keys only:");
		System.out.println(ks);
		
		Collection<String> val = m.values();
		System.out.println("\nTo get values only:");
		System.out.println(val);
		System.out.println("NEW PROGRAM");
	}

}
