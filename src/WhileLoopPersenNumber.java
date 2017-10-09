import java.util.Scanner;
public class WhileLoopPersenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n,per;
		System.out.println("Enter the value of num: ");
		num=new Scanner(System.in).nextInt();
		
		/*System.out.println("Enter the persen of odd number first and lass");
		per=new Scanner(System.in).nextInt();*/
		
		//n=(int)(num*(per/100));
		n=(int)(num*0.25);
		
		int i=0,sum1=0,sum2=0;
		System.out.println("\nThe first odd number: ");
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.print(" "+i);
				sum1+=i;
			}
			i++;
		}
		i=num;
		System.out.println("\nThe last odd number: ");
		while(i>=num-n)
		{
			if(i%2!=0)
			{
				System.out.print(" "+i);
				sum2+=i;	
			}
			i--;
		}
		System.out.println("\nThe sum of first odd number is: "+sum1);
		System.out.println("The sum of last odd number is: "+sum2);
	}

}
