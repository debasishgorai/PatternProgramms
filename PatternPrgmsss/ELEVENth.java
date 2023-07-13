package PatternPrgmJSPIDER;

public class ELEVENth {
	public static void main(String[]args) {
	int n=5;
	int sp=0;
	int st=n-1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=st;j++) {
			System.out.print("*");
			
		}
		System.out.println();
		st--;
		sp++;
	}
}}
