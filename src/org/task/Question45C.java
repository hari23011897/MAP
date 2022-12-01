package org.task;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class Question45C {
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
		System.out.println("TreeMap:\n" + m);
		Set<Entry<Character, Integer>> e1 = m.entrySet();
		System.out.println(e1);
		System.out.println("\nUsing enhanced for loop:");
		for (Entry<Character, Integer> i1 : e1) {
			System.out.println(i1);
		}
		System.out.println("\nTo get keys and value combination:");
		for (Entry<Character, Integer> k1 : e1) {
			Character ko = k1.getKey();
			Integer vo = k1.getValue();
			System.out.println(ko);
			System.out.println(vo);
		}

	}

}
