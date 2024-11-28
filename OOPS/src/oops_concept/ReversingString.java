package oops_concept;
import java.util.Scanner;

public class ReversingString {
	public void reverse(String s , String r) {
		for(int i=s.length()-1;i>=0;--i) {
			r=r+s.charAt(i);
		}
		System.out.println(r);
	}
	public static void main(String args[]) {
		ReversingString ob = new ReversingString();
		Scanner sc = new Scanner(System.in);
		String r = " ";
		String s = sc.nextLine();
		ob.reverse(s, r);
		
	}

}
