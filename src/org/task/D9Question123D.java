package org.task;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class D9Question123D {
	public static void main(String[] args) {
		Map<String, String> m = new Hashtable<>();
		
		m.put("vel", "selenium");
		m.put("Ganesh", "fraework");
		m.put("Dinesh", "oracle");
		m.put("Vengat", "corejava");
		m.put("subash", "jira");
		
		System.out.println("HashTable:");
		System.out.println(m);
		
		Set<String> ks = m.keySet();
		System.out.println("\nTo get keys only:");
		System.out.println(ks);
		
		Collection<String> val = m.values();
		System.out.println("\nTo get values only:");
		System.out.println(val);
		
	}

}
