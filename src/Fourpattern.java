
public class Fourpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<=n/2+1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i||j>n-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
