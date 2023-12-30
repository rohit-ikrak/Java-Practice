package Concepts.OOPS.Polymorphism;

interface Inter{
	void call();
}

public class PolyInterface implements Inter {
	@Override
	public void call() {
		System.out.println("newbie");
	}
	public static void main(String[] args) {
		PolyInterface p = new PolyInterface();
		p.call();
	}
}