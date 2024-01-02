
interface First{
	//we can define default, static and private methods.
	default void run() {
		System.out.println("It can run.");
		walk();
		stop();
	}
	static void walk() {
		System.out.println("It can walk.");
	}
	private void stop() {
		System.out.println("It can stop.");
	}
	public static void maid() {
		System.out.println("It's a maid.");
	}
	//abstract method don't specify a body
	abstract void speak();
	void work(); // this is also abstract method inside interface
}
interface Second{ //we can extend interfaces
	// all variables are public, static and final in an interface and must be given a value;
	public static final int a = 10;
	int b=2;
	
}

class InterfaceExample implements First, Second{

	//annotation is given in this
	@Override
	public void speak() {
		System.out.println("It can speak from class.");
		
	}

	@Override
	public void work() {
		System.out.println("It can work from class.");
		
	}
	public static void main(String[] args) {
		InterfaceExample ie = new InterfaceExample();
		ie.run();
		ie.speak();
		ie.work();
		First.walk();	//static can be accessed without object
//		ie.stop();	//private
		System.out.println(Second.a);
		First.maid();
//		System.out.println(ie.b); //we should not use static variables with objects
		First f = new InterfaceExample();
		f.speak();
	}
}
