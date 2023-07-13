package PatternPrgmJSPIDER;

public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=9;
       int sp=n-1;
       int st=1;
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=sp;j++) {
    		   System.out.print("");
    	   }
    	   for(int j=1;j<=st;j++) {
    		   if(j==1||j==st||i==n) {
    			   System.out.print("*");
    		   }
    		   else {
    			   System.out.print("");
    		   }
    		   System.out.println();
    	   }
       }
	}

}
