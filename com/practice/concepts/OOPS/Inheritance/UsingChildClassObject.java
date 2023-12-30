//we can access parent class variables by using setter getter methods with child objects. If the variable with same
//name is present in both parent and child class, then by default child class object accesses child class variable.

class Parent{
	int age;
	String name;
	void job() {
		System.out.println("Works as a developer.");
	}
	void interest() {
		System.out.println("Likes Watching Movies.");
	}
	public void setparentInfo(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
}
class Child extends Parent{
	int age;
	String name;
	void job() {
		System.out.println("Student");
	}
	void fatherInfo() {
		System.out.println(getAge() + " " + getName());
	}
	void childInfo() {
		System.out.println(this.age + " " + this.name);
	}
}

public class UsingChildClassObject {
	public static void main(String[] args) {		
		Child c = new Child();
		c.name = "Rohit Karki";
		c.age = 22;
		c.setparentInfo(49, "Hira Singh");
		c.fatherInfo();
		c.childInfo();
	}
}

