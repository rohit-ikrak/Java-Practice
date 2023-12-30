// used to access parent class attributes(variables or method) and invoke constructor ;
// It is used only on the child class in relation to parent class

class Father{
	String name;
	int age;
	int var=10;
	Father(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Son extends Father{
	String name;
	int age;
	int var=super.var+10;
	Son(String name, int age, String fname, int fage){
		super(fname, fage);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFatherAge() {
		return super.age;
	}

	public String getFatherName() {
		return super.name;
	}
}
public class UseOfSuper {
	public static void main(String[] args) {
		Son s = new Son("Rohit Karki",24, "Hira Singh", 53);
		System.out.println("Name : " + s.getName());
		System.out.println("Age : " + s.getAge());
		System.out.println("Father Name : " + s.getFatherName());
		System.out.println("Father Age : " + s.getFatherAge());
		System.out.println(s.var);
		Father f = new Son("son", 2, "father", 4);
		System.out.println(f.name + " " +f.age);
		
	}
}
