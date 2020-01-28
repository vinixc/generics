package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.2);
		List<Object> myObjs = new ArrayList<Object>();
		List<Number> myNumber = new ArrayList<Number>();
		
		copy(myInts, myNumber);
		printList(myNumber);
		
		copy(myInts, myObjs);
		printList(myNumber);
		
		copy(myDoubles, myNumber);
		printList(myNumber);
		
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj +" ");
		}
		System.out.println();
	}

}
