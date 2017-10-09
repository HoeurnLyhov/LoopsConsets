import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		int num=0;
		int roll=0;
		System.out.println("Enter the number");
		num=new Scanner(System.in).nextInt();
		System.out.println("Enter the roll");
		roll=new Scanner(System.in).nextInt();
		for(int i=1;i<=roll;i++)
		{
			System.out.println("");
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "+j);
			}
			
		}
	}

}
