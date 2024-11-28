package oops_concept;



public class Constructoroverloading {
	public static void main(String args[]) {
		constant ab = new constant();
		ab.volume();
		
		
	}
	
}
class constant{
	double width, depth, height;
	constant(double width, double depth, double height){
		this.width = width;
		this.depth = depth;
		this.height = height;
		
	}
	constant(){
		this(10,45,60);
	}
	public void volume() {
		System.out.println(width*depth*height);	
	
	}
}

