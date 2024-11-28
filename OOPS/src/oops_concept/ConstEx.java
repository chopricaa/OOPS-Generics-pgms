package oops_concept;

class Data{
	int n;
	Data(){
		System.out.println("Constructor ");
	}
	Data(int a){
		this.n=a;
		System.out.println(this.n);
	}
	void display() {
		System.out.println("Display the output");
	}
}
class Data2 extends Data{
	void display2() {
		System.out.println("\n"+super.n);
	}
}

public class ConstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		d.display();
		Data c=new Data(10);
		//System.out.println(d);
		//System.out.println(c);
		Data d2=new Data2();
		//System.out.println(d2);
		//d2.display2();

	}

}

