package Generics;
import java.util.List;

public class Findeleindex {
	public static <T> int element(List<T> arr , T target) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).equals(target)) {
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		List<Integer> ll = List.of(1,3,5,6,8,9,7);
		int target = 6;
		System.out.println(element(ll,target));
	}

}
