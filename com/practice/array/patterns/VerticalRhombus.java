public class VerticalRhombus {
    public static void main(String[] args) {
		int i, j, k, l;
		for(i=0; i<5; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			for(l=0; l<4-i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(i=5; i>0; i--) {
			for(j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			for(l=5; l>i; l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
