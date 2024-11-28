package Generics;
import java.util.*;

public class Mergelists {
	public static <T> List<T> merge(List<T> l1, List<T> l2){
		List<T> mergelist = new ArrayList<>();
		int listmax = Math.max(l1.size(), l2.size());
		for(int i=0;i<listmax;i++) {
			if(i<l1.size()) {
				mergelist.add(l1.get(i));
			}
			if(i<l2.size()) {
				mergelist.add(l2.get(i));
			}
			
			
		}
		return mergelist;
		
	}
	public static void main(String[] args) {
		List<Integer> l1 = List.of(2,4,6,78,9,5);
		List<Integer> l2 = List.of(4,6,85,3,7,4);
		System.out.println(merge(l1,l2));
	}

}
