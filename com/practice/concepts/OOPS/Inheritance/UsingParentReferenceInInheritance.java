// we can't access other methods or variables of child class using parent class reference object 
// and only access methods or variables from parent class present in child class .

class Parent1{
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
class Child1 extends Parent1{
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
public class UsingParentReferenceInInheritance {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.job();
		p.interest();
		p.name = "Rohit";
		p.age = 24;
//		p.fatherInfo(); //can't access this method as it is not defined in parent class
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}

