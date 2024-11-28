package oops_concept;

interface P{
	public void method1();
}
interface Q{
	public void method2();
}
class R implements P,Q{
	 public void method1() {
		System.out.println("Method1 is imolemented");
	}
	public void method2() {
		System.out.println("Method2 is implemented");
		
	}
}

public class interfaces {
	public static void main(String args[]) {
		R r = new R();
		r.method1();
		r.method2();
	}

}
