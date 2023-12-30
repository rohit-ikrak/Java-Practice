//Creating object using parent reference of the abstract class gives the child class method implementation.

abstract class Car{
	int wheel ;
	String name;
	Car(){
		this.wheel = 4;
		this.name = "Car with gears";
	}
	abstract void start();//calling this method redirects to child class method with definition.
	void stop() {
		System.out.println("Press break to stop.");
	}
}

public class UseOfAbstractClass extends Car{
	//No need to give @Override annotation.
	void start() {
		System.out.println("Insert key to start.");
	}
	//priority is given to child class method then parent class method.
	
	void stop() {
		System.out.println("Press Breaks.");
	}
	public static void main(String[] args) {
		Car c = new UseOfAbstractClass();
		System.out.println(c.wheel + " " + c.name);
		c.start();
		c.stop();
		UseOfAbstractClass u = new UseOfAbstractClass();
		u.start();
		u.stop();
//		Car car = new Car(); //Can't create object of an abstract class.
		
	}
}
