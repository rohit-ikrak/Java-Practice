public class BinaryRightAngledTriangle {
    public static void main(String[] args) {
		int i, j;
		int var=1;
		for(i=0;i<5; i++) {
			if(i%2==0) {
				var=1;
			}
			else {
				var=0;
			}
			for(j=0;j<=i;j++) {
				System.out.print(var +" ");
				var=1-var;
			}
			System.out.println();
		}
	}
}
