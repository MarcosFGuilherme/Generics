package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> numbers = new ArrayList<>();
	
	public void addValue(Integer value) {
		numbers.add(value);
	}
	
	public Integer first() {
		if(numbers.isEmpty()) {
			throw new IllegalStateException("List of numbers is empty.");
		}
		return numbers.get(0);
	}
	
	public void print() {
		String str = "[";
		for (Integer num : numbers) {
			str += num.intValue() + ",";
		}
		str = str.substring(0,str.length()-1) + "]";
		System.out.println(str);
	}
	
}
