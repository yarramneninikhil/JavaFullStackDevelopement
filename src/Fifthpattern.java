
public class Fifthpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||i>1&&i<=n/2&&j<=n/2+2-i||i>n/2&&j<=i-n/2)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}

}
