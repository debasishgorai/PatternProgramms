package PatternPrgmJSPIDER;

public class PascalTypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=5;
      int x=0;
      for(int i=1;i<=n;i++) {
    	  if(i%2!=0) {
    		  int a=x+1;
    		  for(int j=1;j<=i;j++) {
    			  System.out.print(a);
    			  a++;
    			  
    		  }
    	  }
    	  else {
    		  x=(i*(i+1))/2;
    		  int y=x;
    		  for(int j=1;j<=i;j++) {
    			  System.out.print(y);
    			  y--;
    		  }
    	  }
    	  System.out.println();
      }
  
	}

}
