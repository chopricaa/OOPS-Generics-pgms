package Generics;

public class Arraycomp {
	public static <T> boolean arrequals(T[] arr1, T[] arr2) {
		if(arr1.length!= arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {2,4,6};
		Integer[] arr2 = {2,4,75};
		System.out.println(arrequals(arr1,arr2));
		
		String[] str1 = {"abc", "pqr", "ABc"};
		String[] str2 = {"abc", "pqr", "abc"};
		System.out.println(arrequals(str1,str2));	
		
	}

}

