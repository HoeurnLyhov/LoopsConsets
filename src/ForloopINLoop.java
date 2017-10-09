import java.util.Scanner;
public class ForloopINLoop {
	
	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter the number: ");
		n=new Scanner(System.in).nextInt();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("");
			for(int j=n;j>0;j--)
			{
				System.out.print(" "+j);
			}
		}
		
		System.out.println(" ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+j);
			}
		}
		
		
		
		System.out.println(" ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+i);
			}
		}
		
		System.out.println(" ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+i);
			}
		}
		
		System.out.println(" ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
		}
		
		
		System.out.println(" ");
		for(int i=n;i>0;i--)
		{
			System.out.println("");
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+j);
			}
		}
		
		System.out.println(" ");
		int k=1;
		for(int i=n;i>0;i--)
		{
			System.out.println("");
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+k);
				k++;
			}
		}
		
		System.out.println(" ");
		for(int i=n;i>0;i--)
		{
			for(int e=i;e>0;e--)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		for(int i=n;i>0;i--)
		{
			System.out.println("");
			for(int e=i;e>0;e--)
			{
				System.out.print("  ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(" "+j);
			}
		}
		
		System.out.println("");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+i);
			}
		}
		
		System.out.println(" ");
		for(int i=1;i<=n;i++)
		{
			System.out.println("");
			for(int e=i;e>0;e--)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+j);
			}
		}
	}

}
