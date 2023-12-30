
class Parent{
	public int add(int a, int b) {
		return a+b;
	}
	public void call() {
		System.out.println("Calling you out.");
	}
}

public class MthdOverriding extends Parent{
	@Override
	public int add(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Parent p = new MthdOverriding();
		System.out.println(p.add(3, 9));
		MthdOverriding mo = new MthdOverriding();
		System.out.println(mo.add(3, 9));
		mo.call();
	}
}

