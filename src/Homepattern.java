
public class Homepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=20;
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {  if(i==1||j==1||i==n||j==n||i>1&&i<=n/2&&j<=n/2-i+1||i>1&&i<=n/2&&j>=n/2+i)
    		  System.out.print("*");
    		  else 
    			  System.out.print(" ");
    	  }
    	  System.out.println();
      }
	}

}
