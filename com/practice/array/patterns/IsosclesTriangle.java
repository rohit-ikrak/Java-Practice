public class IsosclesTriangle {
    public static void main(String[] args) {
		int i, j, k, l;
		for(i=0;i<5; i++) {
			for(j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<2*i+1; k++) {
				System.out.print("*");
			}
			for(l=0;l<4-i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
