package oops_concept;

abstract class Animal{
	abstract void sound();
	
	void stop() {
		System.out.println("Stopped");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Sound comes");
	}
	void sweat() {
		System.out.println("Sweating");
	}
	
}

public class Abstracts {
	public static void main(String args[]) {
		Dog as = new Dog();
		as.stop();
		as.sound();
		as.sweat();
		//Animal pk = new Dog();
		
	}
}
