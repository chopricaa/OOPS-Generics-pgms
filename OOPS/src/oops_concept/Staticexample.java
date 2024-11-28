package oops_concept;

class example{
	static int count =6;
	static {
		int num = 100;
		System.out.println("Static block value is :" +num);
	}
	
	static void increment() {
		count++;
	}
	static void decrement() {
		count--;
	}
	void displaycount() {
		System.out.println(count);
	}
	
	static class Nestedstatic{
		void swim() {
			System.out.println("Swimming");
		}
	}
	
	class Nesteds{
		void cake() {
			System.out.println("Cake is good");
		}
	}
	
	
}

public class Staticexample {
	public static void main(String args[]) {
		example ex = new example();
		example.increment();
		ex.displaycount();
		example.decrement();
		ex.displaycount();
		example.Nestedstatic obj1 = new example.Nestedstatic();
		obj1.swim();
		example.Nesteds obj2 = ex.new Nesteds();
		obj2.cake();
	}
}
