package com.sample.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) {
		Map<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "Deep");
		hs.put(2, "ram");
		hs.put(3, "lucky");
		hs.put(4, "Deeptha");
		
		for(Map.Entry<Integer, String> m : hs.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}
		
		
		
		
	}

}
