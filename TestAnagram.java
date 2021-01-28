package com.piyush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAnagram {

	public static void main(String[] args) {

		String[] sarray = {"GOD","DOG","ODG","SYAM","MYAS"};
		int n = sarray.length;
		testAnagram(sarray);
	}
	private static void testAnagram(String[] sarray) {
		Map<String, List<String>> map = new HashMap<>();
		for(int i=0 ; i< sarray.length; i++) {
			String word = sarray[i];
			char[] charray  = sarray[i].toCharArray();
			Arrays.sort(charray);
			String newString  =  new String(charray);
			
			
			if(map.containsKey(newString)) {
				map.get(newString).add(word);
			}else {
				List<String> words = new ArrayList<>();
				words.add(word);
				map.put(newString, words);
			}
			
		}
		
		for(String s : map.keySet()) {
			List<String> values = map.get(s);
			if(values.size() > 1) {
				System.out.println(values);
			}
		}
		
	}
}
