public class MirrorPattern {
    public static void main(String[] args) {
		int i,j,spaces = 8;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i; j++) {
				System.out.print(j +" ");
			}
			for(j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(j=i;j>=1;j--) {
				System.out.print(" " +j);
			}
			System.out.println();
			System.out.println();
			spaces-=2;
		}
	}
}
