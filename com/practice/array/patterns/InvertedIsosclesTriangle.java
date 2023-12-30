public class InvertedIsosclesTriangle {
    public static void main(String[] args) {
		int i,j, k, l;
		for(i=5;i>0;i--) {
			for(j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(k=i*2-1;k>0;k--) {
				System.out.print("*");
			}
			for(l=5-i;l>0;l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
