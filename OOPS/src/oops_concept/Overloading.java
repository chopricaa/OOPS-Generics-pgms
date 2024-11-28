package oops_concept;
public class Overloading {
	public static void main(String[]args) {
	Br a = new Br();
	Ar b = new Ar();
	System.out.println(a instanceof Ar);
	System.out.println(b instanceof Ar);
	b.eat();
	a.eat();
	}
}
class Ar{
	public void eat() {
		 System.out.println("Eating");
	 }
}
class Br extends  Ar{
	 public void eat() {
		 System.out.println("Eating is not done");
	 }
}

