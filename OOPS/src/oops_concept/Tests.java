package oops_concept;
 import java.util.*;


public class Tests {
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static String add(String a, String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int result = add(5,10);
		System.out.println("Result of 2 integers is:" +result);
		double douresults = add(5.5,6.0);
		System.out.println("Result of 2 floating num is:" +douresults);
		String strs = add("Hello","World");
		System.out.println("Result of 2 strings is:" +strs);
		
	}
	

}
