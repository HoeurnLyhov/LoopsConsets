import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		int num,ch,sum=0;
		System.out.println("Enter a value for num: ");
		num=new Scanner(System.in).nextInt();
		
		System.out.println("Enter your choice....");
		System.out.println("Press\n1. View odd number..");
		System.out.println("2.  View even number...");
		ch=new Scanner(System.in).nextInt();
		int i=0;
		
		if(ch==1)
		{
			i=1;
			System.out.println("The odd number....");
		}
		else
		{
			i=0;
			System.out.println("The even number....");
		}
		
		while(i<num)
		{
			System.out.print(" "+i);
			sum=sum+i;
			i=i+2;
		}
		System.out.println("\nThe sum of number is: "+sum);
	}

}
