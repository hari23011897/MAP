package org.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Question45A {
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
		System.out.println("HashMap:\n"+m);
		Set<Entry<Integer, String>> e1 = m.entrySet();
		System.out.println(e1);
		System.out.println("\nUsing enhanced for loop:");
		for (Entry<Integer, String> i1 : e1) {
			System.out.println(i1);
		}
		System.out.println("\nTo get keys and value combination:");
		for (Entry<Integer, String> k1 : e1) {
			Integer ko = k1.getKey();
			String vo = k1.getValue();
			System.out.println(ko);
			System.out.println(vo);
		}
	}

}
