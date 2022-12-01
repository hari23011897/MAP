package org.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question45B {
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
		System.out.println("LinkedHashMap:\n" + m);
		Set<Entry<Integer, Integer>> e1 = m.entrySet();
		System.out.println(e1);
		System.out.println("\nUsing enhanced for loop:");
		for (Entry<Integer, Integer> i1 : e1) {
			System.out.println(i1);
		}
		System.out.println("\nTo get keys and value combination:");
		for (Entry<Integer, Integer> k1 : e1) {
			Integer ko = k1.getKey();
			Integer vo = k1.getValue();
			System.out.println(ko);
			System.out.println(vo);
		}

	}
}