
public class AlphabeticalLineWise {
    public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<5;i++) {
			char ch='A';
			for(j=0;j<=i;j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
