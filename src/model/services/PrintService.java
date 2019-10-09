package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> numbers = new ArrayList<>();
	
	public void addValue(T value) {
		numbers.add(value);
	}
	
	public T first() {
		if(numbers.isEmpty()) {
			throw new IllegalStateException("List of numbers is empty.");
		}
		return numbers.get(0);
	}
	
	public void print() {
		String str = "[";
		for (T num : numbers) {
			str += num + ",";
		}
		str = str.substring(0,str.length()-1) + "]";
		System.out.println(str);
	}
	
}
