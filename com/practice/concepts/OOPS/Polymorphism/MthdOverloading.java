
public class MthdOverloading {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public String add(String s1, String s2) {
		return (s1+s2);
	}
	public static void main(String[] args) {
		MthdOverloading mo = new MthdOverloading();
		System.out.println(mo.add(23, 12, 10));
		System.out.println(mo.add(12, 23));
		System.out.println(mo.add("Rohit ", "Karki"));
	}
}
