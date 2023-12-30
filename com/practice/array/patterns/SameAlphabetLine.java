public class SameAlphabetLine {
    public static void main(String[] args) {
		int i, j;
		char ch = 'A';
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
