import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter the number: ");
		num=new Scanner(System.in).nextInt();
		for(int i=1;i<num;i++)
		{
			if(i%2==1)
			{
				System.out.print(" "+i);
			}
		}
	}

}
