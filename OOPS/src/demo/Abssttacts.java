package demo;

abstract class Meethods{
	abstract void method2(); 
	
	void method4() {
		System.out.println("Method3 is being implemented");
	}
}
class Abss extends Meethods{
	   void method2() {
		  System.out.println("Method2 is sbeing implemented");
	  }
	   void method3() {
			  System.out.println("Method3 is sbeing implemented");
		  }
	   void method4() {
		   System.out.println("Method4 is being imlemented");
	   }
}
public class Abssttacts {
public static void main(String args[]) {
	Abss mee = new Abss();
	
	

	mee.method2();
	mee.method4();
	//ass.method3();
}
}
