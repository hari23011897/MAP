package org.task;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question45D {
	public static void main(String[] args) {
		Map<String, String> m = new Hashtable<>();

		m.put("vel", "selenium");
		m.put("Ganesh", "fraework");
		m.put("Dinesh", "oracle");
		m.put("Vengat", "corejava");
		m.put("subash", "jira");
		System.out.println("HashTable:\n" + m);
		
		Set<Entry<String,String>> e1 = m.entrySet();
		System.out.println(e1);
		
		System.out.println("\nUsing enhanced for loop:");
		for (Entry<String, String> i1 : e1) {
			System.out.println(i1);
		}
		System.out.println("\nTo get keys and value combination:");
		for (Entry<String, String> k1 : e1) {
			String ko = k1.getKey();
			String vo = k1.getValue();
			System.out.println(ko);
			System.out.println(vo);
		}

	}
}