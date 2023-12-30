public class AlphabeticalRevLineWise {
    public static void main(String[] args) {
		int i,j;
		for(i=5;i>0;i--) {
			char ch = 'A';
			for(j=i;j>0;j--) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
