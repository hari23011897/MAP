package org.task;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D9Question123C {
	public static void main(String[] args) {
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		m.put('!', 10);
		m.put('@', 20);
		m.put('#', 30);
		m.put('$', 40);
		m.put('%', 50);
		m.put('^', 60);
		m.put('&', 10);
		m.put('*', 50);
		m.put('(', 409);
		System.out.println("TreeMap:");
		System.out.println(m);
		
		Set<Character> ks = m.keySet();
		System.out.println("\nTo get keys only:");
		System.out.println(ks);
		
		Collection<Integer> v1 = m.values();
		System.out.println("\nTo get values only:");
		System.out.println(v1);
	}

}
