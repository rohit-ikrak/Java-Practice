public class AlphabeticalPyramid {
    public static void main(String[] args) {
		int i,j;
		
		for(i=0;i<5;i++) {
			for(j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			char ch='A';
			int brpoint= (2*i+1)/2;
			for(j=1;j<=2*i+1;j++) {
				System.out.print(ch);
				if(j<=brpoint) {
					ch++;
				}
				else {
					ch--;
				}
			}
			for(j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
