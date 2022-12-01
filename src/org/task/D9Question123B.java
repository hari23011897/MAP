package org.task;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class D9Question123B {
	public static void main(String[] args) {
		Map<Integer, Integer> m = new LinkedHashMap<>();
		m.put(10, 10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		System.out.println("LinkedHashMap: "+m);
		
		Set<Integer> ks = m.keySet();
		System.out.println("\nTo get keys only:");
		System.out.println(ks);
		
		Collection<Integer> val = m.values();
		System.out.println("\nTo get values only:");
		System.out.println(val);
		
	}
}
