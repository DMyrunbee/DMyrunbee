package darray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDupMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>strings=new ArrayList<>();
		strings.add("apple");
		strings.add("banana");
		strings.add("apple");
		strings.add("orange");
		strings.add("banana");
		
		List<String>duplicates=findDuplicates(strings);
		System.out.println("Duplicates in the list:"+duplicates);
	}
	
	public static List<String>findDuplicates(List<String>strings){
		List<String>duplicates=new ArrayList<>();
		Map<String,Integer>stringCountMap=new HashMap<>();
		
		for(String str:strings) {
		 stringCountMap.put(str, stringCountMap.getOrDefault(str, 0)+1);
		}
		
		for(Map.Entry<String, Integer>entry:stringCountMap.entrySet()){
			if (entry.getValue()>1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;
	}
}


