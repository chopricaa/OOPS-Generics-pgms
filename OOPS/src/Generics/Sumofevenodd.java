package Generics;
import java.util.*;

public class Sumofevenodd {
	public static <T extends Number> void sums(List<T> numbers) {
		int oddsum = 0;
		int evensum = 0;
		for(T number : numbers) {
			int num = number.intValue();
			if(num % 2 == 0) {
				evensum += num;
			}
			else {
				oddsum += num;
			}
		}
		System.out.println("even sum is "+evensum);
		System.out.println("odd sum is "+oddsum);
		
		
	}
	public static void main(String[] args) {
		List<Integer> list  = List.of(1,2,3,4,56,67,9);
		sums(list);
		List<Double> dl = List.of(21.5,72.6,78.98,0.2);
		sums(list);
	}
	

}
