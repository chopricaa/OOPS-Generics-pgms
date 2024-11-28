package Generics;

public class Box <T>{
	private T data;
	public void  add(T data) {
		this.data = data;
	
	}
	public T get() {
		return data;
	}
	public static void main(String[] args) {
		Box<Integer> ob = new Box();
		ob.add(24);
		System.out.println(ob.get());
		Box<String> obl = new Box();
		obl.add("chopricaa");	
		}

}
