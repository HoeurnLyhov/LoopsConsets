import java.util.Scanner;
public class SumEvenOdd 
{

	public static void main(String[] args) 
	{
		int sumE,sumO=0,num;
		int i=0,cont=0;
		System.out.println("Enter a value of num: ");
		num=new Scanner(System.in).nextInt();
		
		/*while(i<num)
		{
			if(cont<=5)
			{
				if(i%2!=0)
				{
					sumO+=i;
					cont++;
				}
			}
			i++;
		}
		*/
		System.out.println("The Odd number 50% is...");
		while(i<num)
		{
			if(i<num/2)
			{
				if(i%2!=0)
				{
					System.out.print(" "+i);
				}
			}
			i++;
		}
		//System.out.println("The sum of odd number is: "+sumO);
		
		

	}

}
